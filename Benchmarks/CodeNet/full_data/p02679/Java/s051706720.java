
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int mod = 1000000007;

//		fact[0] = 1;
//		factInv[0] = 1;
//		for(int i = 0; i < fact.length - 1; i++){
//			fact[i+1] = fact[i]*(i+1) % mod; // n!(mod M)
//	        factInv[i+1] = (int)(factInv[i]*repeatablePow(i+1, mod-2, mod) % mod);
//		}

		long a[] = new long[n];
		long b[] = new long[n];

		int zeros = 0;
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();

			if(a[i] == 0 && b[i] == 0){
				zeros++;
				continue;
			}
			if(a[i] == 0 && b[i] != 0){
				b[i] = 1;
			}
			if(a[i] != 0 && b[i] == 0){
				a[i] = 1;
			}
			if(a[i] != 0 && b[i] != 0){
				long gcd = gcd(a[i], b[i]);
				a[i] /= gcd;
				b[i] /= gcd;
			}

			if(a[i] < 0){
				a[i] *= -1;
				b[i] *= -1;
			}

			String tmpStr = a[i] + "," +b[i];

			if(!map.containsKey(tmpStr)){
				map.put(tmpStr, 1);
			}
			else {
				map.put(tmpStr, map.get(tmpStr) + 1);
			}
		}

		Iterator<String> it = map.keySet().iterator();

		HashSet<String> used = new HashSet<String>();
		long result = 1;
		while(it.hasNext()){
			String tmpStr = it.next();
//			System.out.println(tmpStr);

			if(used.contains(tmpStr)){
				continue;
			}
			String tmpArray[] = tmpStr.split(",");

			long tmpA = Long.parseLong(tmpArray[0]);
			long tmpB = Long.parseLong(tmpArray[1]);

			if(tmpB == 0){
				continue;
			}

			String counterStr = "";
			if(tmpA == 0 && tmpB == 1){
				counterStr = "1,0";
			}
			else {
				if(tmpB > 0){
					counterStr = tmpB + "," + (-tmpA);
				}
				else {
					counterStr = -tmpB + "," + tmpA;
				}
			}

			if(map.containsKey(counterStr)){
				result *= (repeatablePow(2, map.get(tmpStr), mod) + repeatablePow(2, map.get(counterStr), mod) + mod - 1)%mod;
			}
			else {
				result *= repeatablePow(2, map.get(tmpStr), mod)%mod;
			}
			result %= mod;
			used.add(counterStr);
//			System.out.println("str "+tmpStr + " counter "+counterStr+" result" + result);
		}

		result += zeros ;
		result += mod - 1;
		result %= mod;

		System.out.println(result);
	}

	static long gcd(long a, long b){
        long tmp;

        while (a % b != 0)
        {
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return b;
    }
	static long repeatablePow(int x, int n, int mod){
		if(n == 0){
			return 1;
		}
		long result = repeatablePow((int)((long)x*x%mod), n/2, mod);
		if(n % 2 == 1){
			result = result*x%mod;
		}
		return result;
	}

//	static long combination(int a, int b, int mod){ //aCbをmod計算
//	    if(a == 0 && b == 0)return 1;
//	    if(a < b || a < 0)return 0;
//
//	    long tmp = factInv[a - b]* factInv[b] % mod;
//	    return tmp * fact[a] % mod;
//	}

//	static long fact[] = new long[2000002];
//	static long factInv[] = new long[2000002];

}