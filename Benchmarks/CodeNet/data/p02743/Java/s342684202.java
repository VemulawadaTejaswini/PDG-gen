import java.util.Scanner;

public class Main {
    private static final long MODVAL = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        boolean flag = (Math.sqrt(a) + Math.sqrt(b)) < Math.sqrt(c);
        System.out.println(flag ? "Yes" : "No");
    }
}
