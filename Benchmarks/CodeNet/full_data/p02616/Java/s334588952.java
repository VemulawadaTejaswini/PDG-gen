import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    int N,K;
    long MOD = 1000000007;
    TreeMap<Long, Long> counter;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();

        int plus = 0, minus = 0;
        boolean zero = false;

        counter = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            long in = scanner.nextLong();

            if(in > 0){
                plus++;
            } else if(in < 0){
                minus++;
            } else {
                zero = true;
                continue;
            }

            counter.put(in,counter.getOrDefault(in,0L)+1);
        }

        if(plus >= K || (K - plus) % 2 == 0){
            searchMax();
        } else if(zero){
            System.out.println(0);
        } else {
            searchMin();
        }

    }

    long getMax(){
        Map.Entry<Long, Long> entry = counter.floorEntry(Long.MAX_VALUE);

        if(entry == null) return 0;

        long key, value;

        key = entry.getKey();
        if(key < 0) return 0;

        value = entry.getValue();

        if (value == 1){
            counter.remove(key);
        } else {
            counter.put(key, value-1);
        }

        return key;
    }

    long getMin(){
        Map.Entry<Long, Long> entry = counter.ceilingEntry(Long.MIN_VALUE);
        if(entry == null) return 0;

        long key, value;

        key = entry.getKey();
        if(key > 0) return 0;

        value = entry.getValue();

        if (value == 1){
            counter.remove(key);
        } else {
            counter.put(key, value-1);
        }

        return key;
    }

    void searchMax(){
        long R = 1;

        long max1, max2, min1, min2;
        max1 = getMax();
        max2 = getMax();

        min1 = getMin();
        min2 = getMin();

        while(K > 0){
            if(K == 1){
                R = R * max1 % MOD;
                break;
            } else {
                if(max1 * max2 > min1 * min2){
                    R = (R * max1 % MOD) * max2 % MOD;

                    max1 = getMax();
                    max2 = getMax();
                } else {
                    R = R * (min1 * min2 % MOD) % MOD;

                    min1 = getMin();
                    min2 = getMin();
                }
                K -= 2;
            }
        }

        System.out.println(R);
    }

    long getMinPlus(){
        Map.Entry<Long, Long> entry = counter.ceilingEntry(0L);
        if(entry == null) return 1000000001L;

        long key, value;

        key = entry.getKey();

        value = entry.getValue();

        if (value == 1){
            counter.remove(key);
        } else {
            counter.put(key, value-1);
        }

        return key;
    }

    long getMaxMinus(){
        Map.Entry<Long, Long> entry = counter.floorEntry(0L);
        if(entry == null) return -1000000001L;

        long key, value;

        key = entry.getKey();

        value = entry.getValue();

        if (value == 1){
            counter.remove(key);
        } else {
            counter.put(key, value-1);
        }

        return key;
    }

    void searchMin(){
        long R = 1;
        long plus, minus;

        plus  = getMinPlus();
        minus = getMaxMinus();

        while (K > 0){
            if(Math.abs(plus) > Math.abs(minus)){
                R = R * minus % MOD;
                if(R < 0) R += MOD;

                minus = getMaxMinus();
            } else {
                R = R * plus % MOD;

                plus = getMinPlus();
            }
        }

        System.out.println(R);
    }

    public static void main(String[] args){
        new Main();
    }
}
