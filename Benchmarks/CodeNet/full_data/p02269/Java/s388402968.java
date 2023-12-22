import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] dictionary = new String[1000000];
        int right = 0;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0] == "input") {
                dictionary[right] = input[1];
                right++;
            }
            else {
                Arrays.sort(dictionary);
                System.out.println(
                        Arrays.binarySearch(dictionary, 0, right, input[1])
                                >= 0 ? "yes" : "no");
            }
        }
    }
}

