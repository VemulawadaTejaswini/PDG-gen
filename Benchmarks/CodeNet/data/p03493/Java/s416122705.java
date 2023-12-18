import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        char[] a = sc.next().toCharArray();
        int count = 0;
        for (char b : a) {
            if (b == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}