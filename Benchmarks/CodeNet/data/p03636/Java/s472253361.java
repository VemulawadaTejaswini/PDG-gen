import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String first = a.substring(0,1);
        String last = a.substring(a.length() - 1, a.length());
        int body = a.substring(1, a.length() - 1).length();
        System.out.println(first + body + last);
    }
}
