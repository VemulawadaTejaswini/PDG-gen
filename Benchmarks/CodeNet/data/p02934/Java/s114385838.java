import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double bunsi=0;

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            bunsi += 1/x;
        }

        System.out.println(1/bunsi);
    }
}