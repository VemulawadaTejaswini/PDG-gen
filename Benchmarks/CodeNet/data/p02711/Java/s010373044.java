import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        boolean bl = false;
        if ("7".equals(s.substring(0,1))||"7".equals(s.substring(1,2))||"7".equals(s.substring(2,3))) {
            bl = true;
        }
        System.out.println(bl?"Yes":"No");
    }
}
