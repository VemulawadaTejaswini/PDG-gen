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
        
        int maekara = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == maekara + 1) {
                maekara++;
            }
        }
        
        int ushirokara = n + 1;
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] == ushirokara - 1) {
                ushirokara--;
            }
        }
        
        int ans = Math.min(n - maekara, n - (n - ushirokara + 1));
        
        System.out.println(ans);
    }
}
