import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();

        int count = 0;
        double x;
        double y;
        for(int i = 0; i < n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            if(distance(x, y) <= d) count++;
        }

        System.out.println(count);
    }

    private static double distance(double x, double y) {
        return (Math.sqrt(x * x + y * y));
    }
}
