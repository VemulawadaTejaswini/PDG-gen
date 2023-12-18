import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();

        int min = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            String temp = S.substring(i, i + 3);
            int num = Integer.valueOf(temp);
            int sa = Math.abs(num - 753);
            if (min > sa) {
                min = sa;
            }
        }

        System.out.println(min);
    }

}
