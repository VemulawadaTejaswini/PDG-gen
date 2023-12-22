import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {

	static long mod = (long)(1e+9 + 7);
	static int[] sieve;
	static ArrayList<Integer> primes;

	public static void main(String[] args) {
		fast s = new fast();
		int x = s.nextInt();
		int n = s.nextInt();

		boolean[] p = new boolean[103];
		for(int i = 0; i < n; i++) {
			int t = s.nextInt();
			p[t+1] = true;
		}

		int l = x;
		int u = x;
		int ans = x;

		if(p[x+1]) {
			while(l > -1 || u < 101){
				if(l > -1) {
					l--;
					if(!p[l+1]) {
						ans = l;
						break;
					}
				}
				if(u < 101) {
					u++;
					if(!p[u+1]) {
						ans = u;
						break;
					}
				}

			}
		}


		PrintWriter out = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder("");
		sb.append(ans);

		out.println(sb);
		out.close();
	}







	static class fast {

		   private InputStream i;
			private byte[]  buf = new byte[1024];
			private int curChar;

			private int numChars;

			//Return floor log2n
			public static long log2(long bits) // returns 0 for bits=0
				{
				    int log = 0;
				    if( ( bits & 0xffff0000 ) != 0 ) { bits >>>= 16; log = 16; }
				    if( bits >= 256 ) { bits >>>= 8; log += 8; }
				    if( bits >= 16  ) { bits >>>= 4; log += 4; }
				    if( bits >= 4   ) { bits >>>= 2; log += 2; }
				    return log + ( bits >>> 1 );
				}

			public static boolean next_permutation(int a[])
			   {
				   int i=0,j=0;int index=-1;
				   int n=a.length;

				   for(i=0;i<n-1;i++)
					   if(a[i]<a[i+1]) index=i;

				   if(index==-1) return false;
				   i=index;


				   for(j=i+1;j<n && a[i]<a[j];j++);

				   int temp=a[i];
				   a[i]=a[j-1];
				   a[j-1]=temp;

				   for(int p=i+1,q=n-1;p<q;p++,q--)
				   {
					   temp=a[p];
					   a[p]=a[q];
					   a[q]=temp;
				   }

				   return true;
			   }

			public static void sieve(int size)
			{
				sieve=new int[size+1];

				primes=new ArrayList<Integer>();

				sieve[1]=1;

				for(int i=2;i*i<=size;i++)
				{
					if(sieve[i]==0)
					 {
						for(int j=i*i;j<size;j+=i) {sieve[j]=1;}
					 }
				}

				for(int i=2;i<=size;i++)
				{
					if(sieve[i]==0) primes.add(i);
				}
			}

			public static long pow(long a, long p){
			    long o = 1;
			    for(; p>0; p>>=1){
			        if((p&1)==1)o = mul(o, a);
			        a = mul(a, a);
			    }
			    return o;
			}

			public static long add(long... a){
			    long o = 0;
			    for(long x:a)o = (o+mod+x)%mod;
			    return o;
			}

			public static long mul(long... a){
			    long p = 1;
			    for(long x:a)p = (mod+(p*x)%mod)%mod;
			    return p;
			}

			public static long mod_inv(long n)
			{
				return pow(n,mod-2);
			}

			public long gcd(long r,long ans)
			{
				if(r==0) return ans;
				return gcd(ans%r,r);
			}

			public fast() {
				this(System.in);
			}
			public fast(InputStream is) {
				i = is;
			}
			public int read() {
				if (numChars == -1)
					throw new InputMismatchException();
				if (curChar >= numChars) {
					curChar = 0;
					try {
						numChars = i.read(buf);
					} catch (IOException e) {
						throw new InputMismatchException();
					}
					if (numChars <= 0)
						return -1;
				}
				return buf[curChar++];
			}
			public String nextLine() {
				int c = read();
				while (isSpaceChar(c))
					c = read();
				StringBuilder res = new StringBuilder();
				do {
					res.appendCodePoint(c);
					c = read();
				} while (!isEndOfLine(c));
				return res.toString();
			}
			public String nextString() {
	     		int c = read();
				while (isSpaceChar(c))
					c = read();
				StringBuilder res = new StringBuilder();
				do {
					res.appendCodePoint(c);
					c = read();
				} while (!isSpaceChar(c));
				return res.toString();
			}
			public long nextLong() {
				int c = read();
				while (isSpaceChar(c))
					c = read();
				int sgn = 1;
				if (c == '-') {
					sgn = -1;
					c = read();
				}
				long res = 0;
				do {
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					res *= 10;
					res += c - '0';
					c = read();
				} while (!isSpaceChar(c));
				return res * sgn;
			}
			public int nextInt() {
				int c = read();
				while (isSpaceChar(c))
					c = read();
				int sgn = 1;
				if (c == '-') {
					sgn = -1;
					c = read();
				}
				int res = 0;
				do {
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					res *= 10;
					res += c - '0';
					c = read();
				} while (!isSpaceChar(c));
				return res * sgn;
			}
			public boolean isSpaceChar(int c) {
				return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
			}
			public boolean isEndOfLine(int c) {
				return c == '\n' || c == '\r' || c == -1;
			}

		}



}
