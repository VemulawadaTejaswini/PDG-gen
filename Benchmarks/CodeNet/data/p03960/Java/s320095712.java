import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*; 
 

class Main{ 

	static void solve(){
		int h = ni(), w =ni();
		char[][] c = new char[w][h];
		for(int i=0;i<h;++i){
			String s = ns();
			for(int j=0;j<w;++j)c[j][i] = s.charAt(j);
		}
		int ans = 0;
		int[][] dp = new int[h+1][h+1];
		int[][] cost = new int[h+1][h+1];
		for(int i=0;i<w-1;++i){

			for(int h1=0;h1<=h;++h1){
				for(int d=0;d+h1<=h;++d){
					if(d==0)cost[h1+d][d]=0;
					else cost[h1+d][d] = cost[h1+d-1][d-1] + (c[i][h1+d-1] == c[i+1][d-1] ? 1:0);
				}
			}
			for(int h2=0;h2<=h;++h2){
				for(int d=0;d+h2<=h;++d){
					if(d==0)cost[d][h2+d]=0;
					else cost[d][h2+d] = cost[d-1][h2+d-1] + (c[i+1][h2+d-1] == c[i][d-1] ? 1:0);
				}
			}

			for(int h1=h;h1>=0;h1--){
				for(int h2=h;h2>=0;h2--){
					if(h1==h&&h2==h)dp[h1][h2]=0;
					else if(h1==h)dp[h1][h2] = dp[h1][h2+1] + cost[h1][h2+1];
					else if(h2==h)dp[h1][h2] = dp[h1+1][h2] + cost[h1+1][h2];
					else dp[h1][h2] = Math.min(dp[h1][h2+1] + cost[h1][h2+1], dp[h1+1][h2] + cost[h1+1][h2]);
				}
			}
			ans += dp[0][0];
		}
		out.println(ans);
 
	} 
 
 
 
 
	 public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 static boolean inrange(int y, int x, int h, int w){ 
		 return y>=0 && y<h && x>=0 && x<w; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static<T extends Comparable> int lower_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
		 while(upper - lower>1){ 
		 int center =(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>=0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> int upper_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
		 while(upper-lower >1){ 
		 int center=(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> boolean next_permutation(List<T> list){ 
		 int lastIndex = list.size()-2; 
		 while(lastIndex>=0 && list.get(lastIndex).compareTo(list.get(lastIndex+1))>=0)--lastIndex; 
		 if(lastIndex<0)return false; 
		 int swapIndex = list.size()-1; 
		 while(list.get(lastIndex).compareTo(list.get(swapIndex))>=0)swapIndex--; 
		 T tmp = list.get(lastIndex); 
		 list.set(lastIndex++, list.get(swapIndex)); 
		 list.set(swapIndex, tmp); 
		 swapIndex = list.size()-1; 
		 while(lastIndex<swapIndex){ 
		 tmp = list.get(lastIndex); 
		 list.set(lastIndex, list.get(swapIndex)); 
		 list.set(swapIndex, tmp); 
		 ++lastIndex;--swapIndex; 
		 } 
		 return true; 
	 } 
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

