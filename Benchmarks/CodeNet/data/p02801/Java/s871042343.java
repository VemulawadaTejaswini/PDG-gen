import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String c = sc.next();

        System.out.println((char)(c.charAt(0)+1));
    }
}
