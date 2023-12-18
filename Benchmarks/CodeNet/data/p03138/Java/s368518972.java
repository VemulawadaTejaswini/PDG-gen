import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        int[][] count = new int[60][2];
        for (int i = 0; i < n; i++) {
            int j = 0;
            long tmp = array[i];
            while (tmp > 0) {
                int tmp2 = (int)tmp % 2;
                count[j][tmp2]++;
                tmp /= 2;
                j++;
            }
            for (int x = j; x < 60; x++) {
                count[x][0]++;
            }
        }
        
        long ans = 0;
        long now = 1;
        for (int i = 0; i < 60; i++) {
            if (count[i][0] > count[i][1]) {
                if (ans + now >= k) {
                    // System.out.println(ans);
                    break;
                }
                ans += now;
            }
            now *= 2;
            // System.out.println(ans);
        }
        
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i] ^ ans;
        }
        System.out.println(sum);
    }
}