import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int total1 = b - a;
        int total2 = c - b;

        if (a >= 1 && a <= 100 && b >= 1 && b <= 100 && c >= 1 && c <= 100) {
           
            if (total1 == total2) {

                System.out.println("YES");
            } else {

                System.out.println("NO");
            }
        }
    }
}
