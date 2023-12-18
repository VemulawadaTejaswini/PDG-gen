import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*;

class Main{ 

	static void solve(){
		int n = ni();
		long[] s = nla(n);
		boolean[] isPrime = new boolean[100001];
		Arrays.fill(isPrime, true);
		for(int i=2;i<=100000;++i){
			if(!isPrime[i])continue;
			for(int j=i*2;j<=100000;j+=i)isPrime[j]=false;
		}
		List<Integer> primes = new ArrayList<>();
		for(int i=2;i<=100000;++i)if(isPrime[i])primes.add(i);


		Map<List<Integer> , Integer> cnt = new HashMap<>();
		int ans = 0;
		boolean zero=true;
		for(int i=0;i<n;++i){
			List<Integer> list = new ArrayList<>();
			for(int k=0;k<primes.size();++k){
				int p= primes.get(k);
				int c = 0;
				while(s[i]%p==0){
					++c;s[i]/=p;
				}
				if(c%3 > 0){
					list.add((k+1) * (c%3==2 ? primes.size()+1: 1));
				}
			}
			if(s[i]!=1){
				++ans;continue;
			}
			if(list.isEmpty()){
				if(zero)++ans;
				zero=false;continue;
			}
			cnt.put(list, cnt.getOrDefault(list, 0)+1);
		}

		int ans2 = 0;
		Set<List<Integer> > used = new HashSet<>();
		for(Map.Entry<List<Integer> , Integer> entry: cnt.entrySet()){
			if(used.contains(entry.getKey()))continue;
			List<Integer> list = new ArrayList<>();
			for(int k: entry.getKey())list.add(k>primes.size() ? k/(primes.size()+1): k*(primes.size()+1));
			ans2 += Math.max(entry.getValue(), cnt.getOrDefault(list, 0));
			used.add(list);
		}
		out.println(ans+ans2);
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

