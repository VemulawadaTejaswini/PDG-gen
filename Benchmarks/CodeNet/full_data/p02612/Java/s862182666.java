import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        for (int i = 1; i * 1000 < n; i++) {
            count = i;
        }
        System.out.println(count * 1000 - n + 1000);
    }
}