import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

class Solver {

    private final int H;
    private final int W;
    private final int A;
    private final int B;

    Solver(Scanner in) {
        H = in.nextInt();
        W = in.nextInt();
        A = in.nextInt();
        B = in.nextInt();
    }

    void solve() {
        BitSet[] rows = new BitSet[H];
        for (int i = 0; i < rows.length; i++) {
            BitSet row = rows[i] = new BitSet(W);
            if (B == 0) row.set(0, A);
            else {
                int offset = (i / B) * A;
                if (offset + A > W) {
                    System.out.println("No");
//                    return;
                }
                row.set(offset, offset + A);
            }
        }
        StringJoiner join = new StringJoiner("\n");
        for (BitSet row : rows) {
            long[] longs = row.toLongArray();
            StringBuilder sb = new StringBuilder();
            for (int j = longs.length - 1; j >= 0; j--) {
                String bin = Long.toBinaryString(longs[j]);
                sb.append(bin);
            }
            join.add(String.format("%" + W + "s", sb.substring(Math.max(0, sb.length() - W))).replace(' ', '0'));
        }
        System.out.println(join.toString());

        if (false)
        System.out.println(Arrays.stream(rows)
                .map(BitSet::toLongArray)
                .map(Arrays::stream)
                .map(s -> s.mapToObj(Long::toBinaryString).collect(StringBuilder::new, (StringBuilder sb, String st) -> sb.append(st), StringBuilder::append))
//                .map(s -> String.format("%" + W + "s", s).replace(' ', '0'))
                .collect(Collectors.joining("\n")));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}