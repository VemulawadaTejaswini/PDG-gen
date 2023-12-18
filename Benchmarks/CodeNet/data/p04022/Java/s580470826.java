import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num[] nums = new Num[n];
        HashMap<Long, Integer> norms = new HashMap<>();
        HashMap<Long, Integer> pairs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nums[i] = new Num(sc.nextLong());
            if (norms.containsKey(nums[i].norm)) {
                norms.put(nums[i].norm, norms.get(nums[i].norm) + 1);
            } else {
                norms.put(nums[i].norm, 1);
            }
            if (pairs.containsKey(nums[i].pair)) {
                pairs.put(nums[i].pair, pairs.get(nums[i].pair) + 1);
            } else {
                pairs.put(nums[i].pair, 1);
            }
        }
        long oneCount = 0;
        long count = 0;
        for (Map.Entry<Long, Integer> entry : norms.entrySet()) {
            if (pairs.containsKey(entry.getKey())) {
                if (entry.getKey() == 1) {
                    oneCount += entry.getValue() - 1;
                } else {
                    count += Math.min(entry.getValue(), pairs.get(entry.getKey()));
                }
            }
        }
        System.out.println(n - count / 2 - oneCount);
    }
    
    static class Num<Num> {
        long value;
        HashMap<Long, Integer> map;
        long norm;
        long pair;
        
        public Num(long value) {
            this.value = value;
            map = new HashMap<>();
            for (long i = 2; i <= Math.sqrt(value); i++) {
                while (value % i == 0) {
                    if (map.containsKey(i)) {
                        map.put(i, map.get(i) + 1);
                    } else {
                        map.put(i, 1);
                    }
                    value /= i;
                }
            }
           if (value != 1) {
                if (map.containsKey(value)) {
                    map.put(value, map.get(value) + 1);
                } else {
                    map.put(value, 1);
                }
            }
            norm = 1;
            pair = 1;
            for (Map.Entry<Long, Integer> entry : map.entrySet()) {
                int x = entry.getValue();
                norm *= (long)(Math.pow(entry.getKey(), x % 3));
                pair *= (long)(Math.pow(entry.getKey(), (3 - x % 3) % 3));
            }
        }
    }
}