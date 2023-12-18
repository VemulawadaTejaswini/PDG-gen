
import java.util.Scanner;

// *** at 2018/**/**

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveA();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        // 猫
        int A = sc.nextInt();
        // 謎
        int B = sc.nextInt();
        // 猫ピッタリ
        int X = sc.nextInt();
        if (X - A <= B && A < X) {
            System.out.println("YES");
        } else {
        	System.out.println("NO");
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