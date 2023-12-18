import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if(isAppropriateNums(n, map)) {
            long count = 1;
            n /= 2;
            while(n > 0) {
                count *= 2;
                n--;
            }
            System.out.println(count);
        } else {
            System.out.println(0);
        }
    }

    static boolean isAppropriateNums(int n, HashMap<Integer, Integer> map) {

        if(map.size() != n - (n/2)) return false;
        if(n % 2 == 0) {
            int key = n-1;
            while(key >= 1) {
                if(!map.containsKey(key)) {
                    return false;
                }
                key -= 2;
            }
            for(int value: map.values()) {
                if(value != 2) return false;
            }
        } else {
            int key = n-1;
            while(key >= 0) {
                if(!map.containsKey(key)) {
                    return false;
                }
                key -= 2;
            }
            if(!map.containsKey(0) || map.get(0) != 1) return false;
            map.remove(0);
            for(int value: map.values()) {
                if(value != 2) return false;
            }
        }
        return true;
    }
}
