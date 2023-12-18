import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] token = line.split(" ");
        int k = Integer.parseInt(token[0]);
        int x = Integer.parseInt(token[1]);

        int left = x - k + 1;
        int right = x + k - 1;

        for (int i = left; i <= right; i++) {
            System.out.print(i);
            if (i != right) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }

}
