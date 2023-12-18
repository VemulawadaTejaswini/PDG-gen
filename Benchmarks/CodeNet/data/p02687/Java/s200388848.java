import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        //a = "ABC" ? System.out.println("ARC") : System.out.println("ABC");
        System.out.println(a.equals("ABC") ? "ARC" : "ABC");
    }
}
