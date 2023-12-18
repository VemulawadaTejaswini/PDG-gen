import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    private static char[] map;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        FastScan scan = new FastScan(System.in);
        String S = scan.strings()[0];
        int length = S.length();
        char[] data = S.toCharArray();
        int[][] step = new int[length][3];
        for (int i = 0; i < length; i++) {
            Arrays.fill(step[i],Integer.MAX_VALUE);
        }
        for (int i = 0; i < length - 1; i++) {
            if (data[i] == 'R' && data[i+1] == 'L') {
                step[i][0] = 0;
                step[i][1] = i;
                step[i][2] = 1;
                step[i+1][0] = 0;
                step[i+1][1] = i+1;
                step[i+1][2] = -1;
            }
        }
        Deque<Integer> deq = new ArrayDeque<Integer>();
        for (int i = 0; i < length; i++) {
            if (step[i][0] == 0) {
                continue;
            }
            deq.add(i);
        }
        while(!deq.isEmpty()) {
            int x = deq.poll();
            if (data[x] == 'L' && step[x-1][0] != Integer.MAX_VALUE) {
                step[x][0] = step[x-1][0] + 1;
                step[x][1] = step[x-1][1];
                step[x][2] = step[x-1][2];
                continue;
            }
            if (data[x] == 'R' && step[x+1][0] != Integer.MAX_VALUE) {
                step[x][0] = step[x+1][0] + 1;
                step[x][1] = step[x+1][1];
                step[x][2] = step[x+1][2];
                continue;
            }
            deq.add(x);
        }
        int[] answer = new int[length];
        BigInteger total = BigInteger.TEN.pow(100);
        BigInteger two = new BigInteger("2");
        for (int i = 0; i < length; i++) {
            BigInteger remain = total.subtract(new BigInteger(Long.toString(step[i][0])));
            if (remain.mod(two).longValue() == 0) {
                answer[step[i][1]] += 1;
            } else {
                answer[step[i][1]+step[i][2]] += 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (long i : answer) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
    class FastScan {
        BufferedReader br;
        FastScan(InputStream is)  {
            InputStreamReader isr = new InputStreamReader(is);
            this.br = new BufferedReader(isr);
        }
        String[] strings() throws IOException {
            return this.br.readLine().split(" ");
        }
        long[] longs() throws IOException {
            String[] list = this.br.readLine().split(" ");
            return Stream.of(list).mapToLong(s -> Long.parseLong(s)).toArray();
        }
        int[] ints() throws IOException {
            String[] list = this.br.readLine().split(" ");
            return Stream.of(list).mapToInt(s -> Integer.parseInt(s)).toArray();
        }
    }
}
