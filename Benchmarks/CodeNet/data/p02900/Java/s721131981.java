import java.util.*;
//素因数分解
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        TreeMap<Long,Long> mapA = primeFactorize(a);
        TreeMap<Long,Long> mapB = primeFactorize(b);
        mapA.put(1L, 1L);
        mapB.put(1L, 1L);

        long cnt =0;
        for(Long key:mapA.keySet()){
 
			if(mapB.containsKey(key)){
				cnt++;
			}
		}
		long ans = cnt;
		System.out.println(ans);
    }

    public static TreeMap<Long, Long> primeFactorize(long N) {
	TreeMap<Long, Long> map = new TreeMap<>();
	for (long i = 2; i * i <= N; i++) {
		long k = 0;
		while (N % i == 0) {
			k++;
			N /= i;
		}
		if(k!=0)
			map.put(i, k);
	}
	map.put(N, 1L);
	return map;
}

    public static long gcd(long a, long b){
        if(b == 0){return a;}
        return gcd(b, a%b);
    }
}
