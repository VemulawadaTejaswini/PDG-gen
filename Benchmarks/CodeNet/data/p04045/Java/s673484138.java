import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        boolean[] isHate = new boolean[10];
        Arrays.fill(isHate, false);
        for (int i = 0; i < k; i++) {
            isHate[sc.nextInt()] = true;
        }

        long num = n;
        while (isContainsHateNumber(isHate, num) >= 0) {
            num++;
        }
        System.out.println(num);
    }

    private static int isContainsHateNumber(boolean[] isHate, long num) {
        int digitNum = Long.toString(num).length();
        for (int i = 0; i < digitNum; i++) {
            int digit = Integer.parseInt(String.valueOf(Long.toString(num).charAt(i)));
            if (isHate[digit]) return i;
        }
        return -1;
    }
}
