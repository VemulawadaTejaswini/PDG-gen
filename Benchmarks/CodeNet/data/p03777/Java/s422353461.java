import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        if (a.equals("H")) {
            if (b.equals("H")) {
                System.out.println("H");
            } else {
                System.out.println("D");
        }
        } else {
            if (b.equals("D")) {
            System.out.println("H");
        } else {
            System.out.println("D");
        } 
    }
    }
}
