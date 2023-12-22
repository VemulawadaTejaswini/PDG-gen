
import java.io.*;
import java.util.*;
 
public class Main{
	class Team{
		int solve;
		int pena;
		int idx;
		int[] problems;
		
		public Team(int idx, int P){
			this.idx = idx;
			problems = new int[P];
		}
		
		public boolean equals(Team o){
			if(solve == o.solve && pena == o.pena){
				return true;
			}else{
				return false;
			}
		}
	}
 
	public void solve(){
		while(true){
			int M = nextInt();
			int T = nextInt();
			int P = nextInt();
			int R = nextInt();
			if(M == 0) return;
			Team[] teams = new Team[T];
			for(int i = 0; i < T; i++){
				teams[i] = new Team(i, P);
			}
			
			for(int i = 0; i < R; i++){
				int m = nextInt();
				int t = nextInt() - 1;
				int p = nextInt() - 1;
				int j = nextInt();
				if(j == 0){
					teams[t].pena = m + teams[t].problems[p] * 20;
					teams[t].solve ++;
				}else{
					teams[t].problems[p]++;
				}
			}
			Arrays.sort(teams, (a,b) -> {
				if(a.solve == b.solve){
					if(a.pena == b.pena){
						return Integer.compare(b.idx, a.idx);
					}else{
						return Integer.compare(a.pena, b.pena);
					}
				}else{
					return Integer.compare(b.solve, a.solve);
				}
			});
			
			out.print(teams[0].idx + 1);
			Team prev = teams[0];
			for(int i = 1; i < T; i++){
				if(prev.equals(teams[i])){
					out.print("=");
				}else{
					out.print(",");
				}
				prev = teams[i];
				out.print(teams[i].idx + 1);
			}
			out.println();
		}
	}
	public int sqrt(int v){
		for(int i = 1; i * i <= v; i++){
			if(i * i == v) return i;
		}
		return -1;
	}
	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
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
		return minus ? -num : num;
	}
	
	public static long nextLong(){
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
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
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
}