import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[100001];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();
            if (value > 100000) {
                ans++;
            } else {
                list[(int)value]++;
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (i > list[i]) {
                ans += list[i];
            } else if (i < list[i]) {
                ans += list[i] - i;
            }
        }

        System.out.println(ans);
    }
}