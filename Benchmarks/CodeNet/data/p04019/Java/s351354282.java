import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main main = new Main();

            main.solveA(sc);
            // main.solveB(sc);
            // main.solveC(sc);

        }
    }

    private void solveC(Scanner sc) {

    }

    void solveB(Scanner sc) {
    }

    void solveA(Scanner sc) {
        String s = sc.next();
        if (s.indexOf("N") >= 0 && s.indexOf("S") < 0) {
            System.out.println("No");
            return;
        }
        if (s.indexOf("S") >= 0 && s.indexOf("N") < 0) {
            System.out.println("No");
            return;
        }
        if (s.indexOf("W") >= 0 && s.indexOf("E") < 0) {
            System.out.println("No");
            return;
        }
        if (s.indexOf("E") >= 0 && s.indexOf("W") < 0) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

}
