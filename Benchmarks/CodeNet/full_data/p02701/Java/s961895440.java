import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++) {
            String s = scanner.next();
            set.add(s);
        }
        System.out.println(set.size());
    }
}
