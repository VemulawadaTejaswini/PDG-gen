import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i < q; i++) {
            int player = sc.nextInt() - 1;
            array[player]++;
        }
        
        for (int i = 0; i < n; i++) {
            if (k - (q - array[i]) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
