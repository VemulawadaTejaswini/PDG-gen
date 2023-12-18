import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

class Main {

    static final long modnum = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Blue = K;
        int Red = N - K;
        for (int i = 1; i <= K; i++) {
            long blueCov = combination(Blue - 1, i - 1)%modnum;
            long moveableRed = Red-(i-1);
            // System.out.println(moveableRed);//ok
            long redCov = combination(moveableRed + i, i)%modnum;
            long ans = blueCov * redCov;
            ans%=modnum;
            // System.out.println(blueCov+" "+redCov+" "+ans);
            System.out.println(ans);
        }
    }

    private static long permutation(long num1, long num2) {
        if (num2 == 1) {
            return num1;
        }
        return num1 * permutation(num1 - 1, num2 - 1);
    }

    private static long combination(long num1, long num2) {
        if (num2 == 0) {
            return 1;
        }
        return (num1 - num2 + 1) * combination(num1, num2 - 1) / num2;
    }
}