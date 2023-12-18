import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) { new Main(); }

	public Main() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int n = fs.nextInt();
		int[] S = fs.nextIntArray(n);
		int[] T = fs.nextIntArray(n);
		long[] U = new long[n], V = new long[n];
		for(int i = 0; i < n; i++) U[i] = fs.nextLong();
		for(int i = 0; i < n; i++) V[i] = fs.nextLong();
		
		long[][] arr = new long[n][n];
		for(int i = 0; i < n; i++) {
			if(S[i] == 1) continue;
			for(int j = 0; j < n; j++) arr[i][j] |= U[i];
		}
		for(int j = 0; j < n; j++) {
			if(T[j] == 1) continue;
			for(int i = 0; i < n; i++) arr[i][j] |= V[j];
		}
		
		for(int i = 0; i < n; i++) {
			if(S[i] == 1) continue;
			long AND = Long.MAX_VALUE;
			for(int j = 0; j < n; j++) AND &= arr[i][j];
			if(AND != U[i]) no();
		}
		for(int j = 0; j < n; j++) {
			if(T[j] == 1) continue;
			long AND = Long.MAX_VALUE;
			for(int i = 0; i < n; i++) AND &= arr[i][j];
			if(AND != V[j]) no();
		}
		
		for(int i = 0; i < n; i++) {
			if(S[i] == 0) continue;
			for(int bit = 0; bit < 64; bit++) {
				if(((1L<<bit)&U[i]) == 0) continue;
				boolean has = false;
				for(int j = 0; j < n; j++) {
					if(((1L<<bit)&arr[i][j]) > 0) has = true;
				}
				if(has) continue;
				
				for(int j = 0; j < n; j++) {
					
					//mess up col?
					boolean bad = false;
					long val = (1L<<bit);
					arr[i][j] += val;

					if(T[j] == 1) {
						long x = (1L<<bit)&V[j];
						if(x == 0) bad = true;
					}
					else {
						long AND = Long.MAX_VALUE;
						for(int k = 0; k < n; k++) {
							AND &= arr[k][j];
						}
						if(AND != V[j]) {
							bad = true;
						}
					}
					
					if(bad) {
						arr[i][j] -= val;
					}
					else {
						has = true;
						break;
					}
				}
				if(!has) no();
			}
		}
		
		for(int j = 0; j < n; j++) {
			if(T[j] == 0) continue;
			for(int bit = 0; bit < 64; bit++) {
				if(((1L<<bit)&V[j]) == 0) continue;
				boolean has = false;
				for(int i = 0; i < n; i++) {
					if(((1L<<bit)&arr[i][j]) > 0) has = true;
				}
				if(has) continue;
				
				for(int i = 0; i < n; i++) {
					
					//mess up row?
					boolean bad = false;
					long val = (1L<<bit);
					arr[i][j] += val;

					if(S[i] == 1) {
						long x = (1L<<bit)&U[i];
						if(x == 0) bad = true;
					}
					else {
						long AND = Long.MAX_VALUE;
						for(int k = 0; k < n; k++) {
							AND &= arr[i][k];
						}
						if(AND != U[i]) {
							bad = true;
						}
					}
					
					if(bad) {
						arr[i][j] -= val;
					}
					else {
						has = true;
						break;
					}
				}
				if(!has) no();
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(S[i] == 1) {
				long OR = 0;
				for(int j = 0; j < n; j++) OR |= arr[i][j];
				if(OR != U[i]) no();
			}
			else {
				long AND = Long.MAX_VALUE;
				for(int j = 0; j < n; j++) AND &= arr[i][j];
				if(AND != U[i]) no();
			}
		}
		
		for(int j = 0; j < n; j++) {
			if(T[j] == 1) {
				long OR = 0;
				for(int i = 0; i < n; i++) OR |= arr[i][j];
				if(OR != V[j]) no();
			}
			else {
				long AND = Long.MAX_VALUE;
				for(int i = 0; i < n; i++) AND &= arr[i][j];
				if(AND != V[j]) no();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j > 0) out.print(" ");
				out.print(arr[i][j]);
			}
			out.println();
		}
		
		out.close();
	}
	
	void no() {
		System.out.println(-1);
		System.exit(0);
	}
	
	class FastScanner {
		public int BS = 1<<16;
		public char NC = (char)0;
		byte[] buf = new byte[BS];
		int bId = 0, size = 0;
		char c = NC;
		double num = 1;
		BufferedInputStream in;

		public FastScanner() {
			in = new BufferedInputStream(System.in, BS);
		}

		public FastScanner(String s) {
			try {
				in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
			}
			catch (Exception e) {
				in = new BufferedInputStream(System.in, BS);
			}
		}

		public char nextChar(){
			while(bId==size) {
				try {
					size = in.read(buf);
				}catch(Exception e) {
					return NC;
				}                
				if(size==-1)return NC;
				bId=0;
			}
			return (char)buf[bId++];
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public long nextLong() {
			num=1;
			boolean neg = false;
			if(c==NC)c=nextChar();
			for(;(c<'0' || c>'9'); c = nextChar()) {
				if(c=='-')neg=true;
			}
			long res = 0;
			for(; c>='0' && c <='9'; c=nextChar()) {
				res = (res<<3)+(res<<1)+c-'0';
				num*=10;
			}
			return neg?-res:res;
		}

		public double nextDouble() {
			double cur = nextLong();
			return c!='.' ? cur:cur+nextLong()/num;
		}

		public String next() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c>32) {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public String nextLine() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c!='\n') {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public boolean hasNext() {
			if(c>32)return true;
			while(true) {
				c=nextChar();
				if(c==NC)return false;
				else if(c>32)return true;
			}
		}
		
		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for(int i = 0; i < n; i++) res[i] = nextInt();
			return res;
		}
		
	}

}