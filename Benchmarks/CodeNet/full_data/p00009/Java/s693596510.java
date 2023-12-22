import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static Scanner sc;
    public static HashMap<Integer, Integer> map;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        map = new HashMap<>();
        
        for (int i = 0; i < 1000000; i++) {
            map.put(i, -1);
        }
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int res = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) res++;
            }
            System.out.println(res);
        }
    }
    
    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            map.put(num, 1);
            return true;
        }
        if (map.get(num) == 1) return true;
        if (map.get(num) == 0) return false;
        
        for (int i = 2; i < num; i++) {
            for (int j = i; j*j <= num; j++) {
                if (num%i == 0) {
                    map.put(num, 0);
                    return false;
                }
            }
        }
        map.put(num, 1);
        return true;
    }
}