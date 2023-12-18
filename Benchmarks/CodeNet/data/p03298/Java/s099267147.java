import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*;

class Main{ 

	static void solve(){ 
		int N = ni();
		String S  = ns();
		String sb = S.substring(N,2*N);
		Map<String, Integer> map = new HashMap<>();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i=0;i<(1<<N);++i){
			sb1 = new StringBuilder();
			sb2 = new StringBuilder();
			for(int j=0;j<N;++j){
				if(((i>>j)&1)==1)sb1.append(sb.charAt(j));
				else sb2.append(sb.charAt(j));
			}
			map.put(sb1.toString()+"$"+sb2.toString(), map.getOrDefault(sb1.toString()+"$"+sb2.toString(), 0)+1);
		}
//		for(Map.Entry entry: map.entrySet())out.println(entry.getKey()+" "+entry.getValue());
		long ans = 0;
		for(int i=0;i<(1<<N);++i){
			sb1 = new StringBuilder();
			sb2 = new StringBuilder();
			for(int j=N-1;j>=0;--j){
				if(((i>>j)&1)==1)sb1.append(S.charAt(j));
				else sb2.append(S.charAt(j));
			}
			ans += (long)map.getOrDefault(sb1.toString()+"$"+sb2.toString(), 0);
//			if((long)map.getOrDefault(sb1.toString(), 0)*map.getOrDefault(sb2.toString(), 0)>0){
//				out.println(sb1.toString()+" "+sb2.toString());
//			}
//			ans += (long)map.getOrDefault(sb1.toString(), 0)*map.getOrDefault(sb2.toString(), 0);
		}
		out.println(ans);

 
	} 
 
 
 
 
	public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 private static final byte[] buffer = new byte[1<<15]; 
	 private static int ptr = 0; 
	 private static int buflen = 0; 
	 private static boolean hasNextByte(){ 
		 if(ptr<buflen)return true; 
		 ptr = 0; 
		 try{ 
			 buflen = in.read(buffer); 
		 } catch (IOException e){ 
			 e.printStackTrace(); 
		 } 
		 return buflen>0; 
	 } 
	 private static int readByte(){ if(hasNextByte()) return buffer[ptr++]; else return -1;} 
	 private static boolean isSpaceChar(int c){ return !(33<=c && c<=126);} 
	 private static int skip(){int res; while((res=readByte())!=-1 && isSpaceChar(res)); return res;} 
 
	 private static double nd(){ return Double.parseDouble(ns()); } 
	 private static char nc(){ return (char)skip(); } 
	 private static String ns(){ 
		 StringBuilder sb = new StringBuilder(); 
		 for(int b=skip();!isSpaceChar(b);b=readByte())sb.append((char)b); 
		 return sb.toString(); 
	 } 
	 private static int[] nia(int n){ 
		 int[] res = new int[n]; 
		 for(int i=0;i<n;++i)res[i]=ni(); 
		 return res; 
	 } 
	 private static long[] nla(int n){ 
		 long[] res = new long[n]; 
		 for(int i=0;i<n;++i)res[i]=nl(); 
		 return res; 
	 } 
	 private static int ni(){ 
		 int res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	 } 
	 private static long nl(){ 
		 long res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	} 
} 

