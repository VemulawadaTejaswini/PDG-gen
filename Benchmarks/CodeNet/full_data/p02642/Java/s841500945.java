import java.util.*;

public class Main {
    static Set<Integer> set;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        set = new HashSet<Integer>();
        Set<Integer> doublecount = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            
            if (!set.contains(array[i])) {
                set.add(array[i]);
            } else {
                doublecount.add(array[i]);
            }
        }
        
        
        Sieve sieve = new Sieve(1000000, set);
        
        // System.out.println(sieve.isPrime(24));
        int count = 0;
        for (int s : set) {
            if (doublecount.contains(s)) continue;
            if (!sieve.isPrime(s)) continue;
            
            count++;
            // System.out.println(s);
        }
        System.out.println(count);
        // for (Integer key : map.keySet()) {
        //     int val = map.get(key);
        //     System.out.println(key + " " + val);
        // }
    }
}
class Sieve {
    int[] minFactor;    // 最小の素因数

    Sieve(int n, Set<Integer> set) {
        minFactor = new int[n + 1];
        minFactor[0] = -1;
        minFactor[1] = -1;
        
        for (int i = 2; i <= n; i++) {
            if (!set.contains(i)) continue;
            if (minFactor[i] != 0) continue;
            
            minFactor[i] = i;
            // if (i <= 30) {
            // System.out.println(i + " " + minFactor[i]);
            // }
            
            if ((long)i * i > (long)n) continue;
            
            for (int j = i * 2; j <= n; j += i) {
                if (minFactor[j] != 0) continue;
                
                minFactor[j] = i;
                // if (i <= 30) {
                // System.out.println(minFactor[j] + " " +  i);
                // }
            }
        }
    }
    
    boolean isPrime(int x) {
        if (minFactor[x] == x) {
            return true;
        }
        
        return false;
    }
    
    // nの素因数のリスト (60 => [2, 2, 3, 5])
    List<Integer> factorList(int x) {
        List<Integer> res = new ArrayList<Integer>();
        
        while (x != 1) {
            res.add(minFactor[x]);
            x /= minFactor[x];
        }
        
        return res;
    }
    
    // nの素因数の頻度 (60 => (2 => 2, 3 => 1, 5 => 1)
    Map<Integer, Integer> factorMap(int x) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        
        List<Integer> factorList = factorList(x);
        
        for (Integer f : factorList) {
            int count = res.getOrDefault(f, 0);
            res.put(f, ++count);
        }
        
        // for (int i = 1; i <= x; i++) {
        //     if (!res.containsKey(i)) {
        //         res.put(i, 0);
        //     }
        // }
        
        return res;
    }
}