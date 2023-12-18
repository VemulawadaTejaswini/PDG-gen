import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int NA = A.length();
        int NB = B.length();

        if (NA > NB) {
            System.out.println("GREATER");
        } else if (NA < NB) {
            System.out.println("LESS");
        } else {
            for (int i = 0; i < NA; i++) {
                char a = A.charAt(i);
                char b = B.charAt(i);
                if (a > b) {
                    System.out.println("GREATER");
                    return;
                } else if (a < b) {
                    System.out.println("LESS");
                    return;
                }
            }
        }

        System.out.println("EQUAL");

        return;
    }

}