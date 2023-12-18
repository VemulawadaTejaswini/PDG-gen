import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // KEYENCE-B - Robot Arms

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] l = new int[n];

        HashMap<Integer,Integer> map = new HashMap<>();

        int p = 0;
        int cnt = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            l[i] = sc.nextInt();
            map.put(x[i],l[i]);
            if (max < x[i]) max = x[i];

        }

        for (int i = 0; i <= max; i++) {
            if (map.containsKey(i) &&
                (cnt == 0 ||
                i - map.get(i) > p)) {
                p = i;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}