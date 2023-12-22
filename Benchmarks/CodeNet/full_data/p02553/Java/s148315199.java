import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        long max = Integer.MIN_VALUE;
        for (int x : new Integer[]{a, b}) {
            for (int y : new Integer[]{c, d}) {
                max = Math.max((long)x * y, max);
            }
        }
        System.out.print(max);
    }
}
