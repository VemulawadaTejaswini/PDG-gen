import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*;
class Main{ 

	static class SegmentTree{
		int n;
		int[] data;
		SegmentTree(int _n){
			n=1;
			while(n<_n)n*=2;
			data = new int[n*2+1];
		}

		void add(int i, int x){
			i+=n;
			data[i]+=x;
			for(i/=2;i>0;i/=2)data[i]=data[2*i]+data[2*i+1];
		}

		int get(int a, int b){
			return get(a,b, 1, 0, n);
		}
		int get(int a, int b, int k, int l, int r){
			if(r<=a || b<=l)return 0;
			if(a<=l&&r<=b)return data[k];
			return get(a,b,2*k, l,(l+r)/2) + get(a,b,2*k+1,(l+r)/2,r);
		}
	}

	static void solve(){
		int n = ni();
		int[] a = nia(n);
		int[] b = new int[n];
		for(int i=0;i<n;++i)b[i]=a[i];
		Arrays.sort(b);
		int left=-1, right=n-1;
		while(right-left>1){
			int center =(right+left)/2;
			SegmentTree st = new SegmentTree(2*n+2);
			st.add(n, 1);
			int sum = 0;
			int t = 0;
			for(int i=0;i<n;++i){
				if(a[i]<=b[center])--t;
				else ++t;
				//t以上を加算
				sum += st.get(n+t+1, 2*n+2);
				st.add(n+t, 1);
			}
			System.out.println(center+" "+sum);
			if(sum>=(long)((n*(n+1))/4l)+1)right=center;
			else left=center;
		}
		System.out.println(b[right]);
 
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

