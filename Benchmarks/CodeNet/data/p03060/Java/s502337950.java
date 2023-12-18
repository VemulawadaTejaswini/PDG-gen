import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String V = scan.nextLine();
        String C = scan.nextLine();
        final List<Integer> v = Arrays.stream(V.split(" ", N)).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        final List<Integer> c = Arrays.stream(C.split(" ", N)).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        System.out.println(find(N, 0, new HashSet<>(), v, c));
    }

    public static int find(int N, int cMax, Set<Integer> mark, List<Integer> v, List<Integer> c) {
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (!mark.contains(i)) {
                final int i1 = cMax + v.get(i) - c.get(i);
                if (i1 > max) {
                    max = i1;
                }
                mark.add(i);
                int sMax = find(N, max, mark, v, c);
                if (sMax > max) {
                    max = sMax;
                }
                mark.remove(i);
            }
        }
        return max;
    }

}
