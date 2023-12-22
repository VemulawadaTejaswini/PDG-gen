import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int m;

        while (!(input = sc.next()).equals("-")) {
            m = sc.nextInt();
            int[] h = new int[m];
            char[] output = new char[input.length()];
            for (int i = 0; i < m; i++) {
                h[i] = sc.nextInt();
            }
            for (int i = 0; i < input.length(); i++) {
                output[i] = input.charAt(i);
            }

            for (int i = 0; i < m; i++) {
                output = change(output, input.length(), h[i]);
            }
            for (char c : output) System.out.print(c);
            System.out.println();
        }
    }

    public static char[] change(char[] input, int length, int n) {
        char[] output = new char[length];

        for (int i = 0; i < length - n; i++) {
            output[i] = input[i+n];
        }
        for (int i = length - n; i < length; i++) {
            output[i] = input[i + n - length];
        }

        return output;
    }
}
