import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double tmp1 = a + b + Math.sqrt(a*b);
        if (tmp1 < (double)c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}