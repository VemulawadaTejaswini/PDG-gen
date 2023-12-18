import java.util.Scanner;

public class Main {
    public static int K;
    public static int X;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        X = sc.nextInt();

        int distance = K - 1;

        int from = X - distance;
        int to = X + distance;

        int output = from;
        while (output <= to) {
            System.out.println(output);
            output++;
        }
    }
}