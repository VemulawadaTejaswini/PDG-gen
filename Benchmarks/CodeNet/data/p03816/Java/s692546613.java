import java.util.ArrayList;
import java.util.List;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), dup = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0, temp; i < n; i++)
            if (list.contains(temp = scanner.nextInt())) dup++;
            else list.add(temp);
        System.out.println(n - dup / 2 * 2);
    }
}