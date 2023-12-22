import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            int[] ns = Stream.of(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .mapToInt(i -> i)
                    .toArray();
            if (n != ns.length) {
                return;
            }
            Integer cnt = 0;
            cnt = mergeSort(ns, 0, ns.length, cnt);
            System.out.println(Arrays.stream(ns)
                    .boxed()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")));
            System.out.println(cnt);
        } catch (NoSuchElementException | NumberFormatException e) {
            System.out.println(e);
        }
    }

    private static Integer mergeSort(
            int[] ns,
            int left,
            int right,
            Integer cnt
    ) {
        if ((left + 1) < right) {
            int mid = (left + right) / 2;
            cnt = mergeSort(ns, left, mid, cnt);
            cnt = mergeSort(ns, mid, right, cnt);
            cnt = merge(ns, left, mid, right, cnt);
        }
        return cnt;
    }

    private static Integer merge(
            int[] ns,
            int left,
            int mid,
            int right,
            Integer cnt
    ) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] ll = new int[n1];
        int[] rl = new int[n2];
        IntStream.rangeClosed(0, n1 - 1).forEach(i -> {
            ll[i] = ns[left + i];
        });
        IntStream.rangeClosed(0, n2 - 1).forEach(i -> {
            rl[i] = ns[mid + i];
        });
        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            cnt++;
            if (i < ll.length && (j >= rl.length ||
                    ll[i] <= rl[j])) {
                ns[k] = ll[i];
                i++;
            } else {
                ns[k] = rl[j];
                j++;
            }
        }
        return cnt;
    }
}


