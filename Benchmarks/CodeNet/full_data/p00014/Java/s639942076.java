import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static long res = 0;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 1; i <= 600/n; i++) {
                res += (long)Math.pow((i-1)*n,2)*n;
            }
            System.out.println(res);
            res = 0;
        }
    }
}