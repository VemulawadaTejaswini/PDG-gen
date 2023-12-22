import java.util.*;

public class Main {
    private static Map<Integer, Integer>[] divisors = null;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        // 素因数分解の記録用
        divisors = new Map[n+1];
        for(int i=1; i<=n; i++) {
            divisors[i] = new HashMap<>();
        }
        
        // エラトステネスの篩（ふるい）を応用した素因数分解
        for(int i=2; i<=n; i++) {
            if(divisors[i].isEmpty()) {
                // iは素数なので、倍数にiをセット
                for(int j=1; j<10000000; j++) {
                    int target = i*j;
                    if(target > n) {
                        break;
                    }
                    int divCount = 0;
                    int targetTemp = target;
                    while(targetTemp%i == 0) {
                        targetTemp /= i;
                        divCount++;
                    }
                    divisors[target].put(i, divCount);
                }
            }
        }
        
        // k * f(k)
        long sum = 1; // k=1
        for(int k=2; k<=n; k++) {
            sum += k * divisorCount(k);
        }
        System.out.println(sum);
    }
    private static long divisorCount(int k) {
        // 素因数分解の結果を使って約数の個数を返す
        long count = 1;
        Set<Integer> keySet = divisors[k].keySet();
        Iterator<Integer> it = keySet.iterator();
        while(it.hasNext()) {
            int base = it.next();
            int exp = divisors[k].get(base);
            // see http://sucrose.hatenablog.com/entry/2014/10/10/235805
            count = count * (exp + 1);
        }
        return count;
    }
}
