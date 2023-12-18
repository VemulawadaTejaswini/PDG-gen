import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = 10000000007L;
        long p = 1;
        for (int i=1; i<=n; i++) {
            p = (p%x) * (i%x);
        }
        System.out.println(p%x);
    }
}