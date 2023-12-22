import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		FastReader in = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int[] arr = in.readArray(n);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int cnt = 0;
		boolean notCoprimeflag = false;
		for(int i=0;i<n;i++) {
			int k = arr[i];
			boolean flag = true;
			for(int j=2;j*j<=arr[i];j++) {
				if(k%j==0) {
					if(map.containsKey(j)) {
						int nTimes = map.get(j)+1;
						if(nTimes==n) notCoprimeflag = true;
						map.put(j, nTimes);
						flag = false;
					}
					else map.put(j,1);
					while(k%j==0) k = k/j;
				}
				if(k==1) break; 
			}
			if(k!=1) {
				if(map.containsKey(k)) {
					int nTimes = map.get(k)+1;
					if(nTimes==n) notCoprimeflag = true;
					map.put(k, nTimes);
					flag = false;
				}
				else map.put(k,1);
			}
			if(!flag) cnt++;
		}
		if(cnt==0) out.println("pairwise coprime");
		else if(notCoprimeflag) out.println("not coprime");
		else out.println("setwise coprime");
		out.close();
	}

	static final Random random=new Random();
	//	static void ruffleSort(Pair[] a) {
	//		int n=a.length;//shuffle, then sort 
	//		for (int i=0; i<n; i++) {
	//			int oi=random.nextInt(n);
	//			Pair temp=a[oi];
	//			a[oi]=a[i]; a[i]=temp;
	//		}
	//		Arrays.sort(a);
	//	}
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	static void ruffleSort(char[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n);
			char temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException  e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 

		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
	}
}

//class Pair implements Comparable<Pair>{
//    int a;
//    int b;
//    public Pair(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//    public int compareTo(Pair o) {
//        if(this.a==o.a)
//            return this.b - o.b;
//        return this.a - o.a;
//    }   
//}