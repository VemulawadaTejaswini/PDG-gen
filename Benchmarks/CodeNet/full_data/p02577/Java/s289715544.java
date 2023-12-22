import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        
        long sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += Integer.parseInt(String.valueOf(c[i]));
        }
        
        String ans = "No";
        if (sum % 9 == 0) {
            ans = "Yes";
        }
        
        System.out.println(ans);
    }
}
