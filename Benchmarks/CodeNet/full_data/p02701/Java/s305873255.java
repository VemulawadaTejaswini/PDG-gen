import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        HashSet<String> result = new HashSet<>();
        for (int i = 0; i < num; i++) {
            String gacha = scanner.nextLine();
            result.add(gacha);
        }
        System.out.println(result.size());
    }
}