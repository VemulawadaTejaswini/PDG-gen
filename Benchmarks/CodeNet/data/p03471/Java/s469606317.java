import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (y - sum >= 10000) {
                sum += 10000;
                a++;
            } else if (y - sum >= 5000) {
                sum += 5000;
                b++;
            } else if (y - sum >= 1000) {
                sum += 1000;
                c++;
            } else  {
                break;
            }
        }
        if (y - sum != 0) {
            a = -1;
            b = -1;
            c = -1;
        }
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.println(c);
    }
}
