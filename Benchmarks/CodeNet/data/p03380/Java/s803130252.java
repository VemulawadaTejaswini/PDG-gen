import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] data = new int[N];
        for(int i = 0; i < N; i++) {
            data[i] = scan.nextInt();
        }
        Arrays.sort(data);
        int max = data[N-1];
        BigInteger[] big = new BigInteger[max+1];
        Arrays.fill(big, BigInteger.ONE);
        for(int i = 1; i <= max; i++) {
            big[i] = big[i-1].multiply(new BigInteger(Integer.toString(i)));
        }
        BigInteger answer = BigInteger.ZERO;
        int m = 0;
        int n = 0;
        for (int i = data.length - 1; 0 <= i; i--) {
            for (int j = 0; j < i; j++) {
                BigInteger target = big[data[i]].divide(big[data[j]]).divide(big[data[i]-data[j]]);
                System.out.println(data[i] + ":" + data[j] + ":" + target);
                if (answer.compareTo(target) < 0) {
                    m = i;
                    n = j;
                    answer = target;
                } else {
                    continue;
                }
            }
        }
        System.out.printf("%d %d\n", data[m], data[n]);
    }
}
