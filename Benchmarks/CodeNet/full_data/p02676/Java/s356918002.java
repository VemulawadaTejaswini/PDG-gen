import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        char c[] = str.toCharArray();
        
        if (c.length <= k) {
            // for (int i = 0; i < c.length; i++) {
                System.out.println(str);
            // }
        } else {
            for (int i = 0; i < k; i++) {
                System.out.print(c[i]);
            }
            System.out.print("...");
            System.out.println();
        }
    }
}
