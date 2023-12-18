import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        int max = Math.max(Math.max(p, q), r);
        System.out.println(p + q + r - max);
    }

}
