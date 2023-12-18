import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % 2 == 0) {
                if (c == 'L') {
                    System.out.println("No");
                    return;
                }
            } else {
                if (c == 'R') {
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
    }
}
