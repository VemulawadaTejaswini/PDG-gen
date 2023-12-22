import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] memo = new int[1000000];
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            memo[array[i] - 1]++;
        }
        Arrays.sort(array);
        long ans = 0;
        if (memo[array[0] - 1] == 1) {
            ans++;
        }
        parent : for (int i = 1; i < n; i++) {
            int v = array[i];
            if (memo[v - 1] > 1) {
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (v % array[j] == 0) {
                    continue parent;
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}