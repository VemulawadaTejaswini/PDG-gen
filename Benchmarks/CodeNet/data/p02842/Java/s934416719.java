import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = n / 1.08;
        if (x == (int) x) {
            System.out.println((int)x);
        } else if (Math.floor(Math.round(x) * 1.08) == n) {
            System.out.println(Math.round(x));
        } else {
            System.out.println(":(");
        }

    }
}