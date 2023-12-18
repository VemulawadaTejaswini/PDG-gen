import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int[] counts = new int[2];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - '0';
            counts[(i + c) % 2]++;
        }

        System.out.println(Math.min(counts[0], counts[1]));
    }
}
