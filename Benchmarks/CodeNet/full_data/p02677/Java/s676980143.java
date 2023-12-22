import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double kakudo = Math.toRadians(Math.abs((h * 30 + m * 0.5) - (m * 6)));
        double ans = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2 * a * b * Math.cos(kakudo));

        System.out.println(ans);
    }
}
