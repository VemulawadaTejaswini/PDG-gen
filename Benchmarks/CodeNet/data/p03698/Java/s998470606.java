import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();
        scanner.close();

        boolean[] arr = new boolean[26];

        for (char c : S) {
            if (arr[c - 97]) {
                System.out.println("no");
                return;
            }

            arr[c - 97] = true;
        }

        System.out.println("yes");

    }
}
