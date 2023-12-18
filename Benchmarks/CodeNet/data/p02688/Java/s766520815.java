import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] ok = new boolean[n];
        for (int i = 0; i < k; i++) {
            int max = sc.nextInt();
            for (int j = 0; j < max; j++) {
                int num = sc.nextInt() - 1;
                ok[num] = true;
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!ok[i]) count++;
        }
        System.out.println(count);
    }
}
