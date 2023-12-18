import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;

public class Main {
	public static IO fs = new IO();
	
	public static long xorval(long [] a,long start) {
		long ret = 0;
		for(int i = 0; i<a.length; i++)ret += (a[i] ^ start);
		//System.out.println(start + " " + ret);
		return ret;
	}
	
	public static void solve() {
		int n = fs.nextInt();
		long k = fs.nextLong();
		long [] a = fs.readlongarray(n);
		long start = 1;
		long ans = -1;
		while(start<=k) {
			ans = Math.max(ans, xorval(a,start));
			start*=2;
			//System.out.println(start);
		}
		if(k == 0) {
			longsort(a);
			long sum = 0;
			for(int i = 0; i<a.length; i++)sum += a[i];
			System.out.println(sum);
		}
		else
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		int t = 1;
		//t = fs.nextInt();
		for(int cs = 0; cs<t; cs++) {
			solve();
		}
	}
	
	static class IO 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public IO() 
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
        
        int [] readintarray(int n) {
        	int [] ret = new int[n];
        	for(int i = 0; i<n; i++) {
        		ret[i] = nextInt();
        	}
        	return ret;
        }
        
        long [] readlongarray(int n) {
        	long [] ret = new long[n];
        	for(int i = 0; i<n; i++) {
        		ret[i] = nextLong();
        	}
        	return ret;
        }
    }
	
	public static void sort(int [] a) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void rversesort(int [] a) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		Collections.reverse(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void longsort(long [] a) {
		ArrayList<Long> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void reverselongsort(long [] a) {
		ArrayList<Long> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		Collections.reverse(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void intpairsort(intpair [] a) {
		List<intpair> temp = new ArrayList<intpair>();
		for(int i = 0; i<a.length; i++)temp.add(a[i]);
		Comparator<intpair> comp = (p1,p2)->{
			if(p1.first == p2.first)return (p1.second<=p2.second?1:-1);
			return (p1.first<p2.first)?1:-1;
		};
		Collections.sort(temp,comp);
		for(int i = 0; i<a.length; i++) {
			a[i] = temp.get(i);
		}
	}
	
	public static void longpairsort(longpair [] a) {
		List<longpair> temp = new ArrayList<longpair>();
		for(int i = 0; i<a.length; i++)temp.add(a[i]);
		Comparator<longpair> comp = (p1,p2)->{
			if(p1.first == p2.first)return (p1.second<=p2.second?1:-1);
			return (p1.first<p2.first)?1:-1;
		};
		Collections.sort(temp,comp);
		for(int i = 0; i<a.length; i++) {
			a[i] = temp.get(i);
		}
	}
	
	public static int lowerBound(int[] a, int low, int high, int element) {
	    while (low < high) {
	        int middle = low + (high - low) / 2;
	        if (element > a[middle]) {
	            low = middle + 1;
	        } else {
	            high = middle;
	        }
	    }
	    return low;
	}
	
	public static int upperBound(int[] a, int low, int high, int element) {
	    while (low < high) {
	        int middle = low + (high - low) / 2;
	        if (a[middle] > element) {
	            high = middle;
	        } else {
	            low = middle + 1;
	        }
	    }
	    return low;
	}
	
	public static long lowerBound(long[] a, int low, int high, long element) {
	    while (low < high) {
	        int middle = low + (high - low) / 2;
	        if (element > a[middle]) {
	            low = middle + 1;
	        } else {
	            high = middle;
	        }
	    }
	    return low;
	}
	
	public static long upperBound(long[] a, int low, int high, long element) {
	    while (low < high) {
	        int middle = low + (high - low) / 2;
	        if (a[middle] > element) {
	            high = middle;
	        } else {
	            low = middle + 1;
	        }
	    }
	    return low;
	}
	
	public static int ceil(int x,int y) {
		return (x % y == 0 ? x / y : (x / y +1));
	}
	
	public static long ceil(long x,long y) {
		return (x % y == 0 ? x / y : (x / y +1));
	}
	
	public static class intpair{
		public int first;
		public int second;
		
		intpair(int x,int y){
			this.first = x;
			this.second = y;
		}
	}
	
	public static class longpair{
		public long first;
		public long second;
		
		longpair(long x,long y){
			this.first = x;
			this.second = y;
		}
	}
	
	public static long power(long x,long y) {
		long res = 1;
		while(y>0) {
			if(y%2 == 1)res = res*x;
			y >>= 1;
			x = x*x;
		}
		return res;
	}
	
	public static long power(long x,long y,long mod) {
		long res = 1;
		x%=mod;
		while(y>0) {
			if(y%2 == 1)res = (res*x)%mod;
			y >>= 1;
			x = (x*x)%mod;
		}
		return res;
	}
}
