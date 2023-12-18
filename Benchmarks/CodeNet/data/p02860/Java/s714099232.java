import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String t = s.substring(0, n / 2);
        String t1 = s.substring(n / 2);
        System.out.println(t.equals(t1) ? "Yes" : "No");
        scan.close();
    }
}