import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = -1;
        if (a == 1) {
            if (b == 2) {
                ans = 3;
            } else {
                ans = 2;
            }
        } else if (a == 2) {
            if (b == 1) {
                ans = 3;
            } else {
                ans = 1;
            }
        } else {
            if (b == 1) {
                ans = 2;
            } else {
                ans = 1;
            }
        }
        System.out.println(ans);

        sc.close();
    }

}
