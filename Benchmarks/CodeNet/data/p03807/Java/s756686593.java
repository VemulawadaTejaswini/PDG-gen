import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        if (Integer.parseInt(sc.next()) == 1) {
            System.out.println("YES");
            sc.close();
            return;
        }
        String input = sc.next();

        String[] inputs = input.split(" ");

        for (int i = 0; i < inputs.length; i++) {
            int value = Integer.parseInt(inputs[i]);
            if (isOddNumber(value)) {
                count++;
            }
        }
        if (isOddNumber(count)) {
            System.out.println("NO");
        } else {

            System.out.println("YES");
        }
        sc.close();
    }

    public static boolean isOddNumber(int i) {
        if (i % 2 == 0) {
            return false;
        }
        return true;
    }
}