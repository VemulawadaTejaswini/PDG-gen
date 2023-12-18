import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        long second = scanner.nextLong();

        boolean isFound = false;
        long start;
        if (first > second) {
            start = first;
        } else {
            start = second;
        }
        while (!isFound) {
            if (start % first == 0 && start % second == 0) {
                System.out.println(start);
                isFound = true;
            }
            start++;
        }
    }
}