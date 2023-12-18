import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.bPlusMinusA();
    }

    private void bPlusMinusA() {
        try (Scanner scan = new Scanner(System.in)) {
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            if (b % a == 0) {
                System.out.println(a + b);
            } else {
                System.out.println(b - a);
            }
        }
    }
}
