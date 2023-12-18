
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = 0, flag = 0;
        int res = 0;
        if (a % 2 == 1 && b % 2 == 1) {
            if (a >= b) {
                for (int i = b + 1; i <= a; i++) {
                    if (i % 2 == 1) {
                        c = i;
                        res = a * b * c;
                        System.out.println(res);
                        flag = 1;
                        break;
                    }
                }

                if (flag == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                for (int i = a + 1; i <= b; i++) {
                    if (i % 2 == 1) {
                        c = i;
                        res = a * b * c;
                        //  System.out.println(res);
                        flag = 1;
                        break;
                    }
                }

                if (flag == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }
        } else {
            System.out.println("No");
        }
    }

}
