

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String value = s.substring(j, i + 1);
                int carry = 0;
                while (!value.isEmpty()) {
                    int tmp = Integer.parseInt(value.substring(0, Math.min(4, value.length()))) + carry * 10;
                    value = value.substring(Math.min(4, value.length()));
                    carry = tmp % 2019;

                }
                if (carry == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
