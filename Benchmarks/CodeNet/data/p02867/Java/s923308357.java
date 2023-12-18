import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static class Node {
        int val;
        int oIndex;

        public Node(int val, int oIndex) {
            this.val = val;
            this.oIndex = oIndex;
        }
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Node[] sa = new Node[N];
        for (int i = 0; i < N; i++) {
            sa[i] = new Node(a[i] ,i);
        }
        Arrays.sort(sa, Comparator.comparingInt(x -> x.val));
        Node[] sb = new Node[N];
        for (int i = 0; i < N; i++) {
            sb[i] = new Node(b[i] ,i);
        }
        Arrays.sort(sb, Comparator.comparingInt(x -> x.val));

        for (int i = 0; i < N; i++) {
            if (sa[i].val > sb[i].val) {
                System.out.println("No");
                return;
            }
        }

        TreeSet<Integer> rem = new TreeSet<>();
        for (int i = 0; i < N; i++)
            rem.add(i);
        int cycle = 0;
        while (!rem.isEmpty()) {
            int s = rem.first();
            rem.remove(s);
            int curr = sb[sa[s].oIndex].oIndex;

            while (curr != s) {
                rem.remove(curr);
                curr = sb[sa[curr].oIndex].oIndex;
            }
            cycle++;
        }

        if (cycle > 1) {
            System.out.println("Yes");
            return;
        }

        for (int i = 0; i < N - 1; i++) {
            if (sb[i].val >= sa[i + 1].val) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}