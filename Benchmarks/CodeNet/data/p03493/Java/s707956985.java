import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.next().toCharArray();
        scanner.close();

        int count = 0;
        for (char c : s) {
            if (c == '1') count++;
        }

        System.out.println(count);
    }
}
