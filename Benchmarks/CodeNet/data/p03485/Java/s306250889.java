import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int ans = (int) Math.ceil((a + b) / 2.0);
        System.out.println(ans);
    }
}