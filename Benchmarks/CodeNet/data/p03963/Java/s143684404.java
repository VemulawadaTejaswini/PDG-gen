import java.io.*;
import java.util.*;

class Main{
	public void run(){
		int n = ni();
		int k = ni();
		int ans = k;
		for(int i=1;i<n;i++)ans *= k - 1;
		out.println(ans);
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