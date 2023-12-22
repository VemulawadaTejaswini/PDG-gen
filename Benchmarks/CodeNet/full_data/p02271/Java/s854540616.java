import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            List<Integer> ns = Stream.of(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int q = Integer.parseInt(sc.nextLine());
            List<Integer> ms = Stream.of(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            ms.forEach(m -> {
                if (makeConbination(ns, m, 0, 0)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            });
        } catch (NoSuchElementException | NumberFormatException e) {
            System.out.println(e);
            return;
        }
    }

    private static boolean makeConbination(List<Integer> ns, int target, int i, int t) {
        if (target == t) {
            return true;
        }
        if (i >= ns.size()) {
            return false;
        }
        int n = ns.get(i++);
        return makeConbination(ns, target, i, t + n) ||
                makeConbination(ns, target, i, t);
    }
}

