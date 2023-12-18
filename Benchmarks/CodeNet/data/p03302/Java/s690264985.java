import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a + b == 15) {
            System.out.println("+");
        } else if (a * b == 15) {
            System.out.println("*");
        } else {
            System.out.println("x");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
