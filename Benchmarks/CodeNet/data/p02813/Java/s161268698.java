import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        TreeSet<Integer> set1 = IntStream.range(0, n).boxed().collect(Collectors.toCollection(TreeSet::new));
        TreeSet<Integer> set2 = IntStream.range(0, n).boxed().collect(Collectors.toCollection(TreeSet::new));
        int p = count(scanner, n, set1);
        scanner.nextLine();
        int q = count(scanner, n, set2);
        System.out.println(Math.abs(p - q));

    }

    static int count(Scanner sc, int n, TreeSet<Integer> set) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int a = (set.subSet(set.first(), num).size() - 1) * factoricalLoop(n - i - 1);
            set.remove(num);
            count += a;
        }
        return count + 1;
    }

    static int factoricalLoop(int n) {
        if (n == 0) return 0;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = num * i;
        }
        return num;
    }
}
