import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (k != 0) {
            System.out.println(-1);
            return;
        }
        
        int l = 1;
        for (int i = 0; i < m; i++) {
            l *= 2;
        }
        
        for (int i = 0; i < l; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        for (int i = l - 1; i >= 0; i--) {
            System.out.print(i);
            if (i != 0) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}