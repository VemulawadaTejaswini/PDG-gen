import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main main = new Main();

            // main.solveA(sc);
            // main.solveB(sc);
            // main.solveC(sc);
            main.solveD(sc);
            // main.solveE(sc);

        }

    }

    private void solveD(Scanner sc) {

        char[] arr = sc.next().toCharArray();
        int[] result = new int[arr.length];

        int nl = -1;
        int nr = -1;
        for (int i = 0; i < arr.length; i++) {
            char directrion = arr[i];

            if (directrion == 'R') {
                if (nl == -1 || i > nl) {
                    for (int j = i; j < arr.length; j++) {
                        if (arr[j] == 'L') {
                            nl = j;
                            break;
                        }

                    }
                }

                boolean isOdd = (nl - i) % 2 == 0;
                result[isOdd ? nl : nl - 1] += 1;
                continue;
            } else {

                if (nr == -1 || i > nr) {
                    for (int j = i; j >= 0; j--) {
                        if (arr[j] == 'R') {
                            nr = j;
                            break;
                        }
                    }
                }

                boolean isOdd = (nr - i) % 2 == 0;
                if (isOdd) {
                    result[nr] += 1;
                } else {
                    result[nr + 1] += 1;
                }
            }

        }

        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println(result[result.length - 1]);
    }

    private void solveE(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); PrintWriter pw = new PrintWriter(System.out)) {

        } catch (IOException e) {

        }
    }

    private void solveC(Scanner sc) {
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = N - 1; i > 0; i--) {
            if (arr[i] >= arr[i - 1]) {
                continue;
            }
            arr[i - 1] -= 1;
            if (arr[i] >= arr[i - 1]) {
                continue;
            }

            System.out.println("No");
            return;
        }

        System.out.println("Yes");

    }

    void solveB(Scanner sc) {
        int N = sc.nextInt();

        int sum = 0;

        if (N >= 10) {
            sum += 9;
        } else {
            System.out.println(N);
            return;
        }

        if (N >= 1000) {
            sum += 900;
        } else {
            System.out.println(sum + Math.max(N - 99, 0));
            return;
        }

        if (N >= 100000) {
            System.out.println(90909);
        } else {
            System.out.println(sum + Math.max(N - 9999, 0));
            return;
        }

    }

    class SolveB {
    }

    class Edge {
    }

    void solveA(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(c - (a - b), 0));

    }
}
