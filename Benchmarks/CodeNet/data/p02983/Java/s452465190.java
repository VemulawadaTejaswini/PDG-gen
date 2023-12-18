import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SOLUTION A
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int answer = solutionA(n, a, b);
//        System.out.println(answer);
//    }
//
//    public static int solutionA (int n, int a, int b) {
//        if ((n * a) < b) {
//            return (n * a);
//        } else {
//            return b;
//        }
//    }

        // SOLUTION B
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println(solutionB(i, j));
    }

    public static int solutionB(int i, int j) {
        return (i * j) % 2019;
    }
}
