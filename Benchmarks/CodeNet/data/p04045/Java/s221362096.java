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

        int num = n;
        while(isContainsHateNumber(hates, num)) num += n;

        System.out.println(num);
    }

    static boolean isContainsHateNumber(int[] hates, int num) {
        int digitNum = Integer.toString(num).length();
        for (int i = 0; i < digitNum; i++) {
            int digit = Integer.parseInt(String.valueOf(Integer.toString(num).charAt(i)));
            for (int hate : hates) {
                if(digit == hate) return true;
            }
        }
        return false;
    }
}
