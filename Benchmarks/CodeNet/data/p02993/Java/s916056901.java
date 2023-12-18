import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String a = str.substring(0,1);
        String b = str.substring(1,2);
        String c = str.substring(2,3);
        String d = str.substring(3,4);
        
        boolean ok = true;
        if (a.equals(b)) {
            ok = false;
        }
        if (b.equals(c)) {
            ok = false;
        }
        if (c.equals(d)) {
            ok = false;
        }
        
        if (ok) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}
