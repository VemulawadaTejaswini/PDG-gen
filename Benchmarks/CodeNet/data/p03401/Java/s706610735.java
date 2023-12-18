import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int m = 0;
            int ans = 0;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    ans += Math.abs(m - array[j]);
                    m = array[j];
                }
            }
            ans += Math.abs(m);
            System.out.println(ans);
        }
    }
}
