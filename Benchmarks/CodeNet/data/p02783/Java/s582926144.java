import java.util.Scanner;

// A - Serval vs Monster
// https://atcoder.jp/contests/abc153/tasks/abc153_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());
        scanner.close();

        System.out.println((int) Math.ceil(H / (double) A));
    }
}
