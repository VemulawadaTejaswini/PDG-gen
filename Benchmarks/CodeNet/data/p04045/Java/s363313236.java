import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] hates = new int[k];
        for (int i = 0; i < k; i++) {
            hates[i] = sc.nextInt();
        }

        long num = n;
        while(isContainsHateNumber(hates, num)) num += n;

        System.out.println(num);
    }

    private static boolean isContainsHateNumber(int[] hates, long num) {
        int digitNum = Long.toString(num).length();
        for (int i = 0; i < digitNum; i++) {
            int digit = Integer.parseInt(String.valueOf(Long.toString(num).charAt(i)));
            for (int hate : hates) {
                if(digit == hate) return true;
            }
        }
        return false;
    }
}
