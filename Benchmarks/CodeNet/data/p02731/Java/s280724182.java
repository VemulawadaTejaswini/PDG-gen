import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        sc.close();
        double a = L / 3.0;

        System.out.printf("%.10f", a * a * a);
    }
}
