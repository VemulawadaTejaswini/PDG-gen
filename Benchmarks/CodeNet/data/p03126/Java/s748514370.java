import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        q_2();
    }

    private static void q_1() {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(b % a == 0 ? b + a : b - a);
        }
    }

    private static void q_2() {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt(); // n人
            int m = scan.nextInt(); // m種類

            Map<Integer, Integer> a = new HashMap<>();
            for(int i=0; i<n; i++) {
                int k = scan.nextInt();
                for(int j=0; j<k; j++) {
                    int am = scan.nextInt();
                    if(a.get(am) == null) {
                        a.put(am, 1);
                    } else {
                        a.put(am, a.get(am) + 1);
                    }
                }
            }

            int cnt = 0;

            for (Integer val : a.values()) {
                if(val == n) {
                    cnt ++;
                }
            }

            System.out.println(cnt);

        }
    }
}
