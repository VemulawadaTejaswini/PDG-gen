import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        int counts = scanner.nextInt();

        for (int i = 0; i < counts; i++) {
            set.add(scanner.nextInt());
        }

        System.out.println(set.size());
    }
}