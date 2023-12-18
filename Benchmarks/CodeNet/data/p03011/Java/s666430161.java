import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();
        System.out.println(p + q + r - Math.max(q, Math.max(q, r)));
    }
}
