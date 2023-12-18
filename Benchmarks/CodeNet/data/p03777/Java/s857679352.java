import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        boolean isLiar = a.equals("H") && b.equals("H") || a.equals("D") && b.equals("D");

        System.out.println(isLiar ? "H" : "D");
    }
}
