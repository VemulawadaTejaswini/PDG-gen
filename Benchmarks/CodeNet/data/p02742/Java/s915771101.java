import java.util.Scanner;

public class Main {
    private static final long MODVAL = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long md = (H%2==1L && W%2==1L) ? 1L : 0L;
        System.out.println(((H * W) / 2) + md);
    }
}
