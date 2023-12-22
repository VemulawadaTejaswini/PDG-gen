import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		// 計算
		String result = "not coprime";
		long gcd = 0;
		for(int i = 0; i < n; i++){
		    if(i == 0){
		        gcd = a[i];
		    }else{
		        gcd = gcd(gcd, a[i]);
		    }
		}
		if(gcd != 1){
		    System.out.println(result);
		    return;
		}
		
		Prime p = new Prime(a[n-1]);
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < n; i++){
		    for(Integer b : p.factorization(a[i]).keySet()){
		        if(set.contains(b)){
		            result = "setwise coprime";
		            System.out.println(result);
		            return;
		        }
		        set.add(b);
		    }
		}
		result = "pairwise coprime";
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
	
	static long gcd(long x, long y){
		if(y == 0) return x;
		return gcd(y , x%y);
	}
}

class Prime {
	int n;
	ArrayList<Integer> primes;
	int[] seive;
	
	public Prime(int n){
		this.n = n;
		int[] seive = new int[n+1];
		Arrays.fill(seive, -1);
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = 2; i <= n; i++){
			if(seive[i] != -1) continue;
			primes.add(i);
			seive[i] = i;
			for(long j = (long)i*i; j <= n; j += i){
				if(seive[(int)j] == -1) seive[(int)j] = i; 
			}
		}
		this.seive = seive;
		this.primes = primes;
	}
	
	public boolean isPrime(int x){
		return seive[x] == x;
	}
	
	public HashMap<Integer, Integer> factorization(int x){
		HashMap<Integer, Integer> factorization = new HashMap<Integer, Integer>();
		ArrayList<Integer> factorList = factorList(x);
		if(factorList.size() == 0) return factorization;
		for(Integer i : factorList){
			int cnt = factorization.getOrDefault(i, 0);
			factorization.put(i, cnt + 1);
		}
		return factorization;
	}
	
	private ArrayList<Integer> factorList(int x){
		ArrayList<Integer> factorList = new ArrayList<Integer>();
		while(x != 1){
			factorList.add(seive[x]);
			x /= seive[x];
		}
		return factorList;
	}
	
	public HashMap<Integer, Integer> lcmMap(int[] array){
		HashMap<Integer, Integer> lcmMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < array.length; i++){
			HashMap<Integer, Integer> map = factorization(array[i]);
			for(Integer key : map.keySet()){
				lcmMap.put(key, max(lcmMap.getOrDefault(key, 0), map.get(key)));
			}
		}
		return lcmMap;
	}
	
}

