import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                x += array[i];
            } else {
                x -= array[i];
            }
        }
        
        x /= 2;
        
        int[] ans = new int[n];
        ans[0] = x;
        for (int i = 1; i < n; i++) {
            ans[i] = array[i-1] - ans[i-1];
        }
        
        for (int i = 0; i < n; i++) {
            ans[i] *= 2;
            if (i != n - 1) {
                System.out.print(ans[i] + " ");
            } else {
                System.out.println(ans[i]);
            }
        }
    }
}
