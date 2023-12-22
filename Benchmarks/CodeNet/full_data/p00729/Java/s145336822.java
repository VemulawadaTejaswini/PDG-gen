
import java.io.*;
import java.util.*;
 
public class Main{
	
	int N;
	int M;
	
	class Pair implements Comparable<Pair>{
		int time;
		int type;
		int no;
		public Pair(int time, int type, int no){
			this.time = time;
			this.type = type;
			this.no = no;
		}
		@Override
		public int compareTo(Pair o) {
			if(time == o.time){
				return Integer.compare(no, o.no);
			}
			return Integer.compare(time, o.time);
		}
		
	}
	
	public void solve(){
		while(true){
			N = nextInt();
			M = nextInt();
			if(N == 0 && M == 0) break;
			Map<Integer, int[]> map = new HashMap<>();
			int r = nextInt();
			for(int i = 0; i < r; i++){
				int t = nextInt();
				int n = nextInt();
				int m = nextInt();
				int s = nextInt();
				if(s == 1){
					get(map, m)[t] += 1;
				}else{
					get(map, m)[t] -= 1;
				}
			}
			
			for(Map.Entry<Integer, int[]> e : map.entrySet()){
				int[] arr = e.getValue();
				for(int i = 1; i < e.getValue().length; i++){
					arr[i] += arr[i - 1];
				}
			}
			
			int Q = nextInt();
			for(int i = 0; i < Q; i++){
				int ts = nextInt();
				int te = nextInt();
				int m = nextInt();
				int ans = 0;
				int[] arr = map.get(m);
				if(arr == null){
					out.println(0);
				}else{
					for(int j = ts; j < te; j++ ){
						if(arr[j] > 0) ans++;
					}
					out.println(ans);
				}
			}
		}
	}
	
	public int[] get(Map<Integer, int[]> map, int id){
		int[] list = map.get(id);
		if(list == null){
			list = new int[2000];
			map.put(id, list);
		}
		return list;
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