import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<String> ab = new HashSet<>();
        for (int i = 0; i < n; i++) {
            ab.add(scan.next());
        }
        System.out.println(ab.size());
    }
}
