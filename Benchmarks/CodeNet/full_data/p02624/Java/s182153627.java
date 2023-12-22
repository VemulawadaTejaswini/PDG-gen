import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] array = new long[n];
        Arrays.fill(array, 1);

        for (int i = 2; i <= n; i++) {
            int count = 0;
            int index;
            while ((index = ++count * i) <= n) {
                array[index - 1]++;
            }
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += array[i] * (i + 1);
        }

        System.out.println(ans);
    }
}