import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x, y, z;
        int tmp;

        x = N / 100;
        tmp = N % 100;

        y = tmp / 10;
        tmp = tmp % 10;

        z = tmp;

        int max = Math.max(x, Math.max(y, z));

        System.out.println(max + "" + max + "" + max);
    }
}