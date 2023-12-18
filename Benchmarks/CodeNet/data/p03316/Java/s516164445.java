import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int order = String.valueOf(N).length();
        int sum = 0;
        double Rr = N;
        for (int i = 0; i < order - 1; i++) {
            Rr /= 10;
        }
        double a;
        for (int i = 0; i < order; i++) {
            a = Math.floor(Rr);
            sum += a;
            Rr = Rr - a;
            Rr *= 10;
        }
        System.out.println(N % sum == 0 ? "Yes" : "No");
    }
}