import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 2019;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer S = new StringBuffer(input.next());
        String reverseS = S.reverse().toString();
        Integer[] sur = new Integer[MOD+1];
        Arrays.fill(sur, 0);
        long T = 0;
        int sum = 0;

        for (int i = 0; i < reverseS.length(); i++) {
            T += Character.getNumericValue(reverseS.charAt(i)) * Math.pow(10, i);
            sur[(int)(T%MOD)]++;
        }
        sum = sur[0];
        sur[0] = 0;
        for (int num : sur) {
            sum += num * (num - 1) / 2;
        }
        System.out.println(sum);
    }
}
