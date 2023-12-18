import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(), B = in.nextInt();
        int res = 1;

        while (A < B) {
            res++;
            A += A - 1;
        }

        System.out.println(res);
    }
}
