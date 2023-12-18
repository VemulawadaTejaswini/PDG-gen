import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // people
        int d = sc.nextInt(); // number of days
        int x = sc.nextInt(); // remainder

        int chocolates = 0;
        for (int i = 0; i < n; ++i) {
            int ai = sc.nextInt(); // frequency
            chocolates += Math.ceil(d / (float)(ai));
        }
        System.out.print(chocolates += x);
    }
}