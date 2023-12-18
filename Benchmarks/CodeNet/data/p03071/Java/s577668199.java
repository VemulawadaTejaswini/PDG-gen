import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max1 = 0;
        if (a >= b) {
            max1 = a;
            a -= 1;
        } else {
            max1 = b;
            b -= 1;
        }
        int max2 = Math.max(a, b);

        System.out.println(max1 + max2);
    }

}
