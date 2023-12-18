import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();

        if (str.equals("A")) {
            System.out.println("T");
        }
        if (str.equals("C")) {
            System.out.println("G");
        }
        if (str.equals("G")) {
            System.out.println("C");
        }
        if (str.equals("T")) {
            System.out.println("A");
        }
    }

}