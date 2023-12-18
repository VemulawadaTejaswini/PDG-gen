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
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        int length = S.length();
        char[] data = S.toCharArray();
        int[][] right = new int[length][3];
        for (int i = 0; i < length; i++) {
            Arrays.fill(right[i],Integer.MAX_VALUE);
        }
        for (int i = length-1; 0<=i; i--) {
            if (data[i]=='L') {
                right[i][0] = 0;
                right[i][1] = i;
                right[i][2] = -1;
                continue;
            }
            right[i][0] = right[i+1][0] + 1;
            right[i][1] = right[i+1][1];
            right[i][2] = right[i+1][2];
        }
        int[][] left = new int[length][3];
        for (int i = 0; i < length; i++) {
            Arrays.fill(left[i],Integer.MAX_VALUE);
        }
        for (int i = 0; i < length; i++) {
            if (data[i]=='R') {
                left[i][0] = 0;
                left[i][1] = i;
                left[i][2] = 1;
                continue;
            }
            left[i][0] = left[i-1][0] + 1;
            left[i][1] = left[i-1][1];
            left[i][2] = left[i-1][2];
        }
        int[] answer = new int[length];
        BigInteger total = BigInteger.TEN.pow(100);
        BigInteger two = new BigInteger("2");
        for (int i = 0; i < length; i++) {
            if (right[i][0] < left[i][0]) {
                BigInteger remain = total.subtract(new BigInteger(Long.toString(left[i][0])));
                if (remain.mod(two).longValue() == 0) {
                    answer[left[i][1]] += 1;
                } else {
                    answer[left[i][1] + left[i][2]] += 1;
                }
            } else {
                BigInteger remain = total.subtract(new BigInteger(Long.toString(right[i][0])));
                if (remain.mod(two).longValue() == 0) {
                    answer[right[i][1]] += 1;
                } else {
                    answer[right[i][1] + right[i][2]] += 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (long i : answer) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
}
