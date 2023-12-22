import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        Arrays.setAll(l, i -> scanner.nextInt());
        Arrays.sort(l);

        long ans = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (l[i] == l[j]) {
                    continue;
                }
                int standard = l[i] + l[j];
                for (int k = j + 1; k < n; k++) {
                    if (l[j] == l[k]) {
                        continue;
                    }
                    if (standard <= l[k]) {
                        break;
                    }
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}