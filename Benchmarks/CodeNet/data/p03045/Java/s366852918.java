import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isNotRoot = new boolean[n + 1];
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int length = sc.nextInt();
            isNotRoot[b] = true;
        }
        
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (!isNotRoot[i]) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}