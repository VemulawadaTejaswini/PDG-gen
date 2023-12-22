import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.next().toCharArray();
        scanner.close();

        for (int i = 0; i < input.length; i++) {
            if (input[i] == '?') {
                if (i != 0 && input[i - 1] == 'P') {
                    input[i] = 'D';
                } else if (input[i + 1] == 'D' && i < input.length) {
                    input[i] = 'P';
                } else if (input[i + 1] == '?' && i < input.length) {
                    input[i] = 'P';
                    input[i + 1] = 'D';
                } else {
                    input[i] = 'D';
                }
            }
        }

        System.out.println(String.valueOf(input));
    }
}
