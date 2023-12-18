import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static int PN = 1000000;
	static List<Integer> prime = new ArrayList<Integer>();
	static Map<Integer,Boolean> primeMap = new HashMap<Integer,Boolean>();
	static int[] arr = new int[10];
	
	public static void main(String[] args) {
		init();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=1;i<=N;i++) {
			int A = sc.nextInt();
			arr[i-1] = A;
			Map<Integer,Integer> tmpMap = compute(map,A);
		}
		BigInteger t = BigInteger.ONE;
		for(Entry<Integer,Integer> entry:map.entrySet()) {
			int a = entry.getKey();
			int p = entry.getValue();
			t = BigInteger.valueOf(a).pow(p).multiply(t);
		}
//		System.out.println(map);
//		System.out.println(t);
		BigInteger res = BigInteger.ZERO;
		for(int i=1;i<=N;i++) {
			BigInteger once = t.add(BigInteger.ZERO).divide(BigInteger.valueOf(arr[i-1]));
			res = res.add(once).mod(BigInteger.valueOf(1000000007));
		}
		System.out.println(res);
	}
	
	private static Map<Integer,Integer> compute(HashMap<Integer, Integer> map,int A) {
		Map<Integer,Integer> tmpMap = new HashMap<Integer, Integer>();
		for(int i=0,size=prime.size();i<size;) {
			
			if( primeMap.get(A) != null) {

				Integer count = tmpMap.get(A) ;
				
				if( count ==  null) {
					tmpMap.put(A, 1);
				}else {
					tmpMap.put(A,count+1);
				}
				
				break;
			}
			
			else if( A % prime.get(i) == 0) {
				int p =  prime.get(i);
				
				Integer count = tmpMap.get(p) ;
				
				if( count ==  null) {
					tmpMap.put(p, 1);
				}else {
					tmpMap.put(p,count+1);
				}
				
				A = A / p;
			}else {
				i++;
			}
		}
		for(Entry<Integer, Integer> entry:tmpMap.entrySet()) {
			int p = entry.getKey();
			int count = entry.getValue();
			
			Integer currCount = map.get(p);
			
			if( currCount == null || currCount <= count) {
				map.put(p,count);
			}
		}
		return tmpMap;
	}
	
	
	
	private static boolean isPrime(int n) {
		int t = (int)Math.sqrt(n);
		for(int i=2;i<=t;i++) {
			if( n% i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void init() {
		primeMap.put(1,true);
		for(int i=2;i<=PN;i++) {
			if( isPrime(i)) {
				prime.add(i);
				primeMap.put(i, true);
			}
		}
//		System.out.println(prime.size()+";largest:"+prime.get(prime.size()-1));
	}
}
