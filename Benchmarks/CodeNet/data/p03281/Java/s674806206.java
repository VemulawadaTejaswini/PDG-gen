

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();

        int ans = 0;
        int count = 1;
        while (a != 1) {
            count++;
            if (a % count == 0) {
                ans++;
                a = a / count;
            }
        }
        System.out.println(ans == 1 ? 0 : ((int) Math.pow(2, ans)));
    }
}
