import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for (int i = 0; i < M/2; i++) {
            p((i + 1) + " " + (i + 2));
        }
        for (int i = 0; i < M - M/2; i++) {
            p((N- i -1) + " " + (N - i));
        }
    }

    public static void p(Object o) {
        System.out.println(o);
    }
}
