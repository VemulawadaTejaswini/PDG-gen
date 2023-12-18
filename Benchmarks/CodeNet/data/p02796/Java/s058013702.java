import java.util.Arrays;
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

        Arrays.sort(x);

        for (int i = 0; i < n; i++) {
            if (cnt == 0 ||
                x[i] - map.get(x[i]) > p) {
                p = x[i];
                cnt++;
            } else if (x[i - 1] + map.get(x[i - 1]) > x[i] + map.get(x[i])) {
                p = x[i];
            }
        }

        System.out.println(cnt);
    }
}