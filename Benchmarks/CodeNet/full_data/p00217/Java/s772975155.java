import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int max = 0;
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                int d = sc.nextInt() + sc.nextInt();
                map.put(d, num);
                max = Math.max(max, d);
            }
            System.out.println(map.get(max) + " " + max);
        }
    }
}