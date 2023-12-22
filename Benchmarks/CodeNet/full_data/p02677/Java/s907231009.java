import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        int minute = 60 * H + M;
        double w_a = Math.PI * (180 - minute) / 360;
        double w_b = Math.PI * (15 - minute) / 30;
        double c = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * Math.cos(w_a - w_b));
        System.out.println(c);
        sc.close();
    }
}