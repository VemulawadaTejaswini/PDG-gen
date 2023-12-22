import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> mp = new HashMap<>();
        long sumA = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sumA += a;
            if (mp.containsKey(a)) {
                mp.put(a, mp.get(a) + 1);
            } else {
                mp.put(a, 1);
            }
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int diff = c - b;
            if (mp.containsKey(b)) {
                int t = mp.get(b);
                mp.replace(b, 0);
                if (mp.containsKey(c)) {
                    mp.replace(c, mp.get(c) + t);
                } else {
                    mp.put(c, t);
                }
                sumA += diff*t;
            }

            System.out.println(sumA);
        }
    }
    
}
