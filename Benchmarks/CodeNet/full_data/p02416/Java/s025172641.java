import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int len, num, sum;

        while (!input.equals("0")) {
            len = input.length();
            sum = 0;

            for (int i = 0; i < len; i++) {
                num = input.charAt(i) - '0';
                sum += num;
            }

            System.out.println(sum);

            input = sc.next();
        }

        sc.close();
    }
}
