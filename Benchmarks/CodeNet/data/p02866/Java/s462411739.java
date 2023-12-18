
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	
	static int p = 998244353;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		
		int []d = new int [n];
		
		for(int i = 0; i < n ;i++) {
			d[i] = sc.nextInt();
			
			if(hm.containsKey(d[i])) {
				hm.put(d[i], hm.get(d[i]) +1);
			}
			else {
				hm.put(d[i], 1);
			}
		}
		
		Arrays.sort(d);
		
		int max = d[n-1];
		
		long ans = 1;
		
		for(int i = 0 ; i <= max ; i++) {
			if(!hm.containsKey(i)) {
				ans = 0;
				break;
			}
			if(hm.get(0) != 1) {
				ans = 0;
				break;
			}
			
			if(i > 0) {
				ans = (long)(ans * (modpow(hm.get(i-1), hm.get(i)))% p);
			}		
		}
		
		System.out.println(ans);
	}
	
	
	static long modpow(long a , int n) {
	    long res = 1;
	    while (n > 0) {
	        if ((n & 1) != 0) {
	        	res = (long)res * a % p;
	        }
	        a =(long) a * a % p;
	        n >>= 1;
	    }
	    return res;
	}
	}

