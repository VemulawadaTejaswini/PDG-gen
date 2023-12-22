import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*; 
 

public class Main {
	public static IO fs = new IO();
	public static long mod = 1_000_000_00_7;
	
	public static long mul(long a,long b) {
		return ((a*b)%mod+mod)%mod;
	}
	
	public static void solve() {
		int n = fs.nextInt(),k = fs.nextInt();
		Long [] a = new Long[n];
		for(int i = 0; i<n; i++)a[i] = fs.nextLong();
		if(k == n) {
			long ans = 1;
			for(int i = 0; i<n; i++)ans = mul(ans,a[i]);
			System.out.println(ans);
		}
		else {
			int poscount = 0;
			for(int i = 0; i<n; i++)poscount+=(a[i]>=0?1:0);
			if(k%2 == 1 && poscount == 0) {
				reverselongsort(a);
				/*
				 * for(int i = 0; i<n; i++)System.out.print(a[i]+" ");
				 * System.out.println((-1*-2*-3)%mod+mod);
				 */
				long ans = 1;
				for(int i = 0; i<k; i++)ans = mul(ans,a[i]);
				System.out.println(ans);
			}
			else if(k%2 == 0 && poscount == 0) {
				longsort(a);
				long ans = 1;
				for(int i = 0; i<k; i++)ans = mul(ans,a[i]);
				System.out.println(ans);
			}
			else {
				Map<Long,Integer> pos = new TreeMap<Long,Integer>();
				Map<Long,Integer> neg = new TreeMap<Long,Integer>();
				for(int i = 0; i<n; i++) {
					if(a[i]>=0) {
						if(pos.containsKey(a[i])) {
							int val = pos.get(a[i]);
							val+=1;
							pos.put(a[i], val);
						}
						else pos.put(a[i],1);
					}
					else {
						if(neg.containsKey(a[i])) {
							int val = neg.get(a[i]);
							val+=1;
							neg.put(a[i], val);
						}
						else neg.put(a[i],1);
					}
				}
				Arrays.sort(a, (x,y) -> (Long.compare( Math.abs(y),  Math.abs(x))));
				long ans = 1;
				int negcount = 0;
				for(int i = 0; i<k; i++) {
					if(a[i]<0) {
						negcount+=1;
						if(neg.containsKey(a[i])) {
							int val = neg.get(a[i]);
							val-=1;
							neg.put(a[i], val);
							if(val<=0)neg.remove(a[i]);
						}
					}
					else {
						if(pos.containsKey(a[i])) {
							int val = pos.get(a[i]);
							val-=1;
							pos.put(a[i], val);
							if(val<=0)pos.remove(a[i]);
						}
					}
					ans = mul(ans,a[i]);
				}
				if(negcount%2 == 0)System.out.println(ans);
				else {
					long ans1 = ans;long ans2 = ans;
					long maximum_negative = Long.MIN_VALUE;long minimum_positive = Long.MAX_VALUE;
					for(int i = 0; i<k; i++) {
						if(a[i]<0)
						maximum_negative = Math.max(maximum_negative, a[i]);
						else minimum_positive = Math.min(minimum_positive, a[i]);
					}
					if(!neg.isEmpty()) {
						Map.Entry<Long,Integer> entry = ((TreeMap<Long, Integer>) neg).firstEntry();
						ans1 = mul(ans1,power(minimum_positive,mod-2,mod));
						ans1 = mul(ans1,entry.getKey());
					}
					if(!pos.isEmpty()) {
						Map.Entry<Long,Integer> entry = ((TreeMap<Long, Integer>) pos).lastEntry();
						ans2 = mul(ans2,power(maximum_negative,mod-2,mod));
						ans2 = mul(ans2,entry.getKey());
					}
					System.out.println(Math.max(ans1, ans2));
				}
			}
		}
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
	
	public static void longsort(Long [] a) {
		ArrayList<Long> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void reverselongsort(Long [] a) {
		ArrayList<Long> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		Collections.reverse(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void pairsort(pair [] a) {
		List<pair> temp = new ArrayList<pair>();
		for(int i = 0; i<a.length; i++)temp.add(a[i]);
		Collections.sort(temp);
		for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
	}
	
	public static class pair implements Comparable<pair>{
		public long first;
		public long second;
		
		pair(long x,long y){
			this.first = x;
			this.second = y;
		}

		@Override
		public int compareTo(pair o) {
			Long val1 = new Long(this.first);
			Long val2 = new Long(o.first);
			int val = val1.compareTo(val2);
			return val;
		}
	}
	
	/*
	 * public static class compare{ public static void sort(pair [] a) {
	 * Arrays.sort(a, new Comparator<pair>() {
	 * 
	 * @Override public int compare(pair p1, pair p2) { return
	 * p1.first.compareTo(p2.first); } }); } }
	 */
	
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
