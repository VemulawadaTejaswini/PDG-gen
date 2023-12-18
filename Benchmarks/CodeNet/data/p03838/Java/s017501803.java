import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        sc.close();
        long ax = Math.abs(x);
        long ay = Math.abs(y);
        long clickCnt;
        if (x >= 0 && y >= 0) {
            // 両方正
            if (x < y) {
                clickCnt = y - x;
            } else {
                clickCnt = y - x + 2;
            }
        } else if (x < 0 && y >= 0) {
            // x:負、y:正
            clickCnt = y - x;
        } else if (x >= 0 && y < 0) {
            // x:正、y:負
            if (ax < ay) {
                clickCnt = ay - ax + 1;
            } else {
                clickCnt = x + y + 1;
            }
        } else {
            // x:負、y:負
            if (ax < ay) {
                clickCnt = 2 + ay - ax;
            } else {
                clickCnt = ax - ay;
            }
        }
        System.out.println(clickCnt);
    }
}
