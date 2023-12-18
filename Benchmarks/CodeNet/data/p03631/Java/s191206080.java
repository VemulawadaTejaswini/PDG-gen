import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        String tmp = new StringBuilder(n).reverse().toString();
        sc.close();

        if (n.equals(tmp)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}