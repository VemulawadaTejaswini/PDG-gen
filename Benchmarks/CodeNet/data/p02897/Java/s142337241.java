import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n / 2 + 1;
        if (n % 2 == 0) {
            long ans = (long) 1/2;
            System.out.println(ans);
        } else {
            long ans = (long) h/n;
            System.out.println(ans);
        }
    }
}
