import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> excluded = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            excluded.add(in.nextInt());
        }

        while (true) {
            List<Integer> source = toNumberList(n);
            if (!contains(source, excluded)) {
                System.out.println(n);
                break;
            }
            n++;
        }

    }
    private static List<Integer> toNumberList(int n) {
        List<Integer> integers = new ArrayList<>();
        while (n != 0) {
            integers.add(n % 10);
            n /= 10;
        }
        return integers;
    }

    private static boolean contains(List<Integer> source, List<Integer> excluded) {
        return source.stream()
                .anyMatch(excluded::contains);
    }
}
