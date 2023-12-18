import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ret = k;
        for (int i = 2;i <= n;i++) {
            ret *= (k-1);
        }
        System.out.println(ret);
    }
}
