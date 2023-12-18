

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x2000 = sc.nextInt();
        int pre = x2000;
        for (int i = 0; i < 10; i++) {
            int ans = r * pre - D;
            System.out.println(ans);
            pre = ans;
        }
    }
}
