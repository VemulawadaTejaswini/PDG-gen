import java.io.*;
import java.util.*;

public class Main{
	
	static int mod=(int)1e9+7;
	
	public static void main(String[] args) throws IOException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Writer out=new Writer(System.out);
		Reader in=new Reader(System.in);
		int ts=1;
		
		outer: while(ts-->0) {	
			
			char [] s=in.next().toCharArray();
			char [] t=in.next().toCharArray();
			int ans=Integer.MAX_VALUE;
			for(int i=0; i<=s.length-t.length; i++) {
				int k=value(s,t,i);
				ans=Math.min(k,ans);
			}
		
			out.println(ans);
		}
		out.close();		
		
	}

	
	static int value(char [] s,char [] t, int i) {
		int count=0;
		for(int j=0; j<t.length; j++) {
			if(s[i+j]!=t[j]) count++;
		}
		return count;
	}
	
	
/*********************************** UTILITY CODE BELOW **************************************/	
	
	static int ans=Integer.MAX_VALUE;
	
	
	
	static int abs(int a) {
		return a>0 ? a : -a;
	}
	static int pow(int n, int m) {
		if(m==0) return 1;
		int temp=pow(n,m/2);
		long res=(((long)temp*temp)%mod);
		if(m%2==0) return (int)res;
		return (int)((res*n)%mod);
	}
	
	static class Pair{
		int u, v;
		
		Pair(int u, int v){this.u=u; this.v=v;}
		
		static void sort(Pair [] coll) {		
			List<Pair> al=new ArrayList<>(Arrays.asList(coll));
			Collections.sort(al,new Comparator<Pair>() {
				public int compare(Pair p1, Pair p2) {
					return p1.u-p2.u;
				}	
			});
			for(int i=0; i<al.size(); i++) {
				coll[i]=al.get(i);
			}
		}
		
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i:a) list.add(i);
		Collections.sort(list);
		for (int i=0; i<a.length; i++) a[i]=list.get(i);
	}
	
	static int [] array(int n, int value) {	
		int a[]=new int[n];
		for(int i=0; i<n; i++) a[i]=value;
		return a;
	}
	
	static class Reader{
		
		BufferedReader br;
		StringTokenizer to;
		
		Reader(InputStream stream){
			br=new BufferedReader(new InputStreamReader(stream));
			to=new StringTokenizer("");
		}
		
		String next() {
			while(!to.hasMoreTokens()) {
				try {
					to=new StringTokenizer(br.readLine());	
				}catch(IOException e) {}
				
			}
			return to.nextToken();
			
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0; i<n ;i++) a[i]=nextInt();
			return a;
		}
		long [] readLongArray(int n) {
			long a[]=new long[n];
			for(int i=0; i<n ;i++) a[i]=nextLong();
			return a;
		}
		
	}
	
	static class Writer extends PrintWriter{
		Writer(OutputStream stream){
			super(stream);
		}
		void println(int [] array) {
			for(int i=0; i<array.length; i++) {
				print(array[i]+" ");
			}
			println();
		}
		void println(long [] array) {
			for(int i=0; i<array.length; i++) {
				print(array[i]+" ");
			}
			println();
		}
	}
	
}