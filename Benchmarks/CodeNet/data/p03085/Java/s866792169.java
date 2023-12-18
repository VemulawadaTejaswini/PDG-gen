import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();

        if (b.equals("A")) {
        System.out.println("T");
        sc.close();
            return;
        }
        if (b.equals("C")) {
        System.out.println("G");
        sc.close();
            return;
        }
        if (b.equals("G")) {
        System.out.println("C");
        sc.close();
            return;
        }
        if (b.equals("T")) {
        System.out.println("A");
        sc.close();
            return;
        }
    }
}