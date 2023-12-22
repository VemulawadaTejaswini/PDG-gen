import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int count = 0;
        for (int i = 0 ; i < k; i++) {
            if (a > 0) {
                count++;
                a--;
                continue;
            }
            if (b > 0) {
                b--;
                continue;
            }
            if (c > 0) {
                c--;
                count--;
            }
        }
        System.out.println(count);
    }
}
