import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();

        if (N < 10) {
            R = R + 100 * (10 - N);
        }
        System.out.println(R);
    }
}