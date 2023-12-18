import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String INPUT = "";

    public static void main(String[] args) {
        InputStream is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());

        Scanner scanner = new Scanner(is);

        final int fiveHundred = scanner.nextInt();
        final int hundred = scanner.nextInt();
        final int fifty = scanner.nextInt();
        final int x = scanner.nextInt();
        List<Pair> keys = new ArrayList<>();
        keys.add(new Pair(500, fiveHundred));
        keys.add(new Pair(100, hundred));
        keys.add(new Pair(50, fifty));
        final List<List<Pair>> result = solve(keys, 0, x, new ArrayList<>());
        System.out.println(result.size());
    }

    static class Pair {
        int val;
        int count;

        public Pair(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }

    static List<List<Pair>> solve(List<Pair> keys, int position, int remaining, List<Pair> acc) {
        List<List<Pair>> result = new ArrayList<>();
        if (position == keys.size()) {

            if (remaining == 0) {
                result.add(new ArrayList<>(acc));
            }
            return result;
        }

        final Pair currentPair = keys.get(position);

        for (int i = 0; i <= remaining / currentPair.val && i <= currentPair.count; i++) {
            acc.add(new Pair(currentPair.val, i));
            result.addAll(solve(keys, position + 1, remaining - currentPair.val * i, acc));
            acc.remove(acc.size() - 1);
        }
        return result;
    }

}
