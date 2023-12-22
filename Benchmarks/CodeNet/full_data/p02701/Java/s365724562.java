import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        HashSet<String> gacha = new HashSet<>();
        for (int i = 0; i < n; i++){
            gacha.add(scanner.nextLine());
        }
        System.out.println(gacha.size());
    }
}