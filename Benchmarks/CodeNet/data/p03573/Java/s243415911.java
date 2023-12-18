import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        if (a.equals(b)) {
            System.out.println(c);    
        } else if (b.equals(c)) {
            System.out.println(a);
        } else if (a.equals(c)) {
            System.out.println(b);
        }
    }
}
