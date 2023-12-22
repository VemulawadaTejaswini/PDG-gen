import java.util.Scanner;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        new Main().excute(System.in);
    }

    public void excute(InputStream in) {
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double b_100 = b * 100;
        int b_new = (int)b_100;
        int c = b_new * a / 100;
        System.out.println(c);
        sc.close();
    }
}