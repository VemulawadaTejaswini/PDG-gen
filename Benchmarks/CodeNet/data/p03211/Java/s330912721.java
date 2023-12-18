import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();
        scanner.close();

        int nearNum = Integer.MAX_VALUE;

        for (int i = 0; i < S.length - 2; i++) {
            int num = Integer.parseInt(String.valueOf(new char[]{S[i], S[i + 1], S[i + 2]}));
            int diff = Math.abs(num - 753);
            if (diff < nearNum) {
                nearNum = diff;
            }
        }

        System.out.println(nearNum);
    }
}
