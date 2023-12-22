import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        sc.close();
        String res = "";
        if (k >= s.length()) {
            res += s;
        } else {
            for (int i = 0; i < k; i++) {
                res += s.charAt(i);
            }
            res += "...";
        }
        
        System.out.println(res);
    }
}