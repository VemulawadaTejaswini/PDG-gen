import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();
        int a = 0;
        if (d == 0) {
            a = 1;
        } else if (d == 1) {
            a = 100;
        } else if (d == 2) {
            a = 10000;
        } else {
            System.exit(1);
        }
        int ans = n * a;
        System.out.println(ans);
    }
}