import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lis = new int[n + 1];
        Arrays.fill(lis, Integer.MAX_VALUE);
        lis[0] = -1;
        int length = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            for (int j = length; j >= 0; j--) {
                if (lis[j] < x) {
                    lis[j + 1] = Math.min(lis[j + 1], x);
                    length = Math.max(length, j + 1);
                    break;
                }
            }
        }
        System.out.println(length);
    }
}
