import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        double ans = Math.ceil(h * w / 2);
        System.out.println((long)ans);
    }
}