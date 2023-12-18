import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String abcd = scanner.next();

        char[] split = abcd.toCharArray();
        int[] ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Character.getNumericValue(split[i]);
        }
        int digit = ints.length;

        for (int i = 0; i < Math.pow(2, digit - 1); i++) {
            int sum = 0;
            boolean sign = true; // true: +, false: -
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < digit; j++) {
                sb.append(ints[j]);
                if (sign) sum += ints[j];
                else sum -= ints[j];
                if ((1 & i >> j) == 1) {
                    sb.append("+");
                    sign = true;
                } else if (j < digit - 1) {
                    sb.append("-");
                    sign = false;
                }
            }
            if (sum == 7) {
                sb.append("=").append(sum);
                System.out.println(sb.toString());
                break;
            }
        }
    }
}
