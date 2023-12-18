import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long res = k * (long)Math.pow(k-1, n - 1);
        System.out.println(res);
    }
}
