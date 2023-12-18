import java.io.*;
import java.util.*;

class Main{
	int N;
	public void run(){
		N = ni();
		char[][] a = new char[N][N];

		boolean uf = true;
		int maxP = 0;
		for (int i=0;i<N;i++){
			String line = next();
			int pNum = 0;
			for (int j=0;j<N;j++){
				if(line.charAt(j) == '#'){
					uf = false;
					pNum++;
				}
				a[i][j] = line.charAt(j);
			}
			maxP = Math.max(pNum, maxP);
		}
		if(uf){
			out.println(-1);
			return;
		}

		out.println(solve(0, 0, a));

	}

	int solve(int d, int n, char[][] a){
		if(d > 6){
			return 6;
		}
		if(check(a)){
			return n;
		}else{
			int mn = 9999;
			for(int i=0;i<N;i++){
				char[] c = new char[N];
				for(int k=0;k<N;k++)c[k] = a[i][k];
				for(int j=0;j<N;j++){
					char[] tmp = new char[N];
					for(int k=0;k<N;k++)tmp[k] = a[k][j];
					for(int k=0;k<N;k++)a[k][j] = c[k];
					int tn = solve(d+1, n+1, a);
					mn = Math.min(mn, tn);
					for(int k=0;k<N;k++)a[k][j] = tmp[k];
					
				}

			}
			return mn;
		}
	}

	boolean check(char[][] a){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(a[i][j] == '.'){
					return false;
				}
			}
		}
		return true;
	}

	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().run();
		out.flush();
	}

	public Main(){
	}

	int ni(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;	}

	long nl(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	double nd(){
		return Double.parseDouble(next());
	}

	String next(){
		int c;
		while(!isAlNum(c = read()));
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	String nextLine(){
		int c;
		while(!isAlNumOrSpace(c = read()));
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNumOrSpace(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
	private static boolean isAlNumOrSpace(int c){
		return isAlNum(c) || c == ' ' || c == '\t';
	}
	void debug(Object... os){
		out.println(Arrays.deepToString(os));
	}
}