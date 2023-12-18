
import java.util.ArrayList;
import java.util.Scanner;

// ABC092 at 2018/**/**

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveB();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        int C = Integer.parseInt(sc.nextLine());
        int D = Integer.parseInt(sc.nextLine());
        int result = 0;

        if (A < B) {
            result += A;
        } else {
            result += B;
        }
        if (C < D) {
            result += C;
        } else {
            result += D;
        }

        System.out.println(result);
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int D = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(sc.nextLine()));
        }
        int result = 0;
        for (Integer num : list) {
            int numa = num.intValue();
            int cnt = 1;
            for (int i = 1; i <= D; i++) {
                if (cnt == i) {
                    result++;
                    cnt += numa;
                }
            }
        }
        System.out.println(result + X);
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