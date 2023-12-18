import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main main = new Main();

            main.solveA(sc);
            // main.solveB(sc);
            // main.solveC(sc);
            // main.solveD(sc);
            // main.solveE(sc);

        }

    }

    private void solveD(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); PrintWriter pw = new PrintWriter(System.out)) {
        } catch (IOException e) {

        }
    }

    private void solveE(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); PrintWriter pw = new PrintWriter(System.out)) {

        } catch (IOException e) {

        }
    }

    private void solveC(Scanner sc) {
    }

    void solveB(Scanner sc) {
    }

    void solveA(Scanner sc) {
        int num = sc.nextInt();
        runA(num);
    }

    private void runA(int num) {
        if (num == 1) {
            System.out.println("1");
            return;
        }
        int min = 1;
        int max = num;
        while (min + 1 < max) {
            int now = (min + max) / 2;
            long x = now * (now + 1) / 2;

            if (x > num) {
                max = now;
            } else if (x == num) {
                System.out.println(now);
                return;
            } else {
                min = now;
            }
        }
        System.out.println(min + 1);
    }

    private static int binarySearch(int[] list, int num) {
        int max = list.length;
        int min = 0;
        while (min + 1 < max) {
            int now = (max + min) / 2;
            if (list[now] > num) {
                max = now;
            } else {
                min = now;
            }
        }
        return min;
    }
}
