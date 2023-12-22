import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            input = sc.next();
            int sum = 0, tmp = 0;

            if (input.equals("0")) break;

            for (int i = 0; i < input.length(); i++) {
                tmp = input.charAt(i) - '0';
                sum += tmp;
            }
            System.out.println(sum);
        }

    }
}
