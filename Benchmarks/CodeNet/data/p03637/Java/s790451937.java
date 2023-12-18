import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //mod 4 == 0
        int a = 0;
        //mod 4 == 2
        int b = 0;
        //mod 4 == 1, 3
        int c = 0;
        for (int i = 0 ; i < n ; i++) {
            int m = sc.nextInt();
            if (m % 4 == 0) {
                a++;
            } else if (m % 4 == 2) {
                b++;
            } else {
                c++;
            }
        }
        if (b == 0) {
            if (c > a + 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            if (c > a) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }

    }

}