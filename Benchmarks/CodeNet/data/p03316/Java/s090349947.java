import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = String.valueOf(sc.nextInt());
        
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(n.substring(i, i + 1));
        }
        boolean ans = false;
        if (Integer.parseInt(n) % sum == 0) {
            ans = true;
        }
        System.out.println(ans ? "Yes":"No");
    }
}
