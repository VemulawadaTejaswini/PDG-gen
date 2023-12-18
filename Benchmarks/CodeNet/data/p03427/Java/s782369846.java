
import java.util.Scanner;

// AGC021 at 2018/03/25

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveA();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        long lngt = String.valueOf(N).length();
        long a = Long.parseLong(N.substring(0, 1));
        long b = a + 9 * (lngt - 1);
        if (Long.parseLong(N) < b) {
            System.out.println(b);
        } else {
            System.out.println(b - 1);
        }
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveC() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveD() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveE() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveF() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

}