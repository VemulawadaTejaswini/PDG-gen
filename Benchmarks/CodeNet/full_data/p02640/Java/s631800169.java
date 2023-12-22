import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        
        for (int i = 0; i <= 10000; i++) {
            int j = n - i;
            
            int tmp = 2 * i + 4 * j;
            
            if (tmp == sum) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
