
import java.util.Scanner;

/**
 * Created by oka on 2018/06/10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ret = 0;
        for (int i = b - a - 1; i > 0; i--) {
            ret += i;
        }
        System.out.println(ret - a);
    }
}
