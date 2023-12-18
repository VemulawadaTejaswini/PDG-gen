import java.util.BitSet;
import java.util.Map;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine().trim();
        String c = sc.nextLine().trim();

        char[] chars = (m + m).toCharArray();
        BitSet[] indexes = new BitSet[27];
        for (int i = 0; i < chars.length; i++) {
            int ch = chars[i] - 'a';
            BitSet index = indexes[ch];
            if (index == null) index = indexes[ch] = new BitSet();
            index.set(i);
        }

        {
            long prev = -1;
            for (char ch : c.toCharArray()) {
                BitSet index = indexes[ch - 'a'];
                if (index == null) {
                    System.out.println(-1);
                    return;
                }
                prev = prev - (prev % m.length()) + index.nextSetBit(((int) prev % m.length()) + 1);
            }

            System.out.println(prev + 1);
        }
    }
}