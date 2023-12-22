import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int k = c[0] - 'a';
        if (0 <= k && k <= 26) {
            System.out.println("a");
        } else {
            System.out.println("A");
        }
    }
}
