import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        boolean isShiritori = false;
        isShiritori = a.substring(a.length() - 1).equals( b.substring(0, 1) ) ? true : false;
        isShiritori = b.substring(b.length() - 1).equals( c.substring(0, 1) ) ? true : false;
        if (isShiritori) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}