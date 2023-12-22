import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[1000000];
        int[] array = new int[n];
        boolean[] no = new boolean[n];
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            array[i] = v;
            count[v - 1]++;
        }

        Arrays.sort(array);

        int ans = n;

        for (int i = 0; i < n; i++) {
            if (count[array[i] - 1] > 1) {
                if (!no[i]) {
                    ans--;
                } else {
                    continue;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (no[j]) {
                    continue;
                }
                if (array[j] % array[i] == 0) {
                    ans--;
                    no[j] = true;
                }
            }
        }

        System.out.println(ans);
    }
}