import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));    // foo[][0]で
        
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (m <= array[i][1]) {
                ans += (long)array[i][0] * m;
                break;
            } else {
                ans += (long)array[i][0] * array[i][1];
                m -= array[i][1];
            }
        }
        
        System.out.println(ans);
    }
}
