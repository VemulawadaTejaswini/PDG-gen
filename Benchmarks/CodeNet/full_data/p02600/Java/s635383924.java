import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int ans = 0;
        if (X <= 599) {
            ans = 8;
        } else if (600 <= X && X <= 799) {
            ans = 7;
        } else if (800 <= X && X <= 999) {
            ans = 6;
        } else if (1000 <= X && X <= 1199) {
            ans = 5;
        } else if (1200 <= X && X <= 1399) {
            ans = 4;
        } else if (1400 <= X && X <= 1599) {
            ans = 3;
        } else if (1600 <= X && X <= 1799) {
            ans = 2;
        } else if (1800 <= X) {
            ans = 1;
        }


        System.out.println(ans);
    }
}
