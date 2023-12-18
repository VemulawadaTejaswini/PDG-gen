import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String[] NM = s.split("\\s+");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int bitset = 0;
        for (int i = 1; i <= M; i++) bitset |= 1 << i;

        for (int i = 0; i < N; i++) {
            int bits = 0;
            String[] split = reader.readLine().split("\\s+");
            for (int r = 1; r < split.length; r++) {
                String num = split[r];
                bits |= 1 << Integer.parseInt(num);
            }
            bitset &= bits;
        }

        bitset = (bitset & 0x55555555) + ((bitset & 0xAAAAAAAA) >>> 1);
        bitset = (bitset & 0x33333333) + ((bitset & 0xCCCCCCCC) >>> 2);
        bitset = (bitset & 0x0F0F0F0F) + ((bitset & 0xF0F0F0F0) >>> 4);
        bitset = (bitset & 0x00FF00FF) + ((bitset & 0xFF00FF00) >>> 8);
        bitset = (bitset & 0x0000FFFF) + ((bitset & 0xFFFF0000) >>> 16);
        System.out.println(bitset);
    }
}