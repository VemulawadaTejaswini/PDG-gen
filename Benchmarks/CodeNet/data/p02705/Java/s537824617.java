import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double ans = 2.0 * Math.PI * n;
        System.out.println(ans);
    }
}
