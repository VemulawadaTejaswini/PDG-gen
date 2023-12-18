import java.util.Scanner;

// B - ROT N
// https://atcoder.jp/contests/abc146/tasks/abc146_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        char[] S = scanner.next().toCharArray();

        scanner.close();

        for (char c : S) {
            int number = c - 'A';
            System.out.print((char) ((number + N) % 26 + 'A'));
        }
        System.out.println();
    }
}
