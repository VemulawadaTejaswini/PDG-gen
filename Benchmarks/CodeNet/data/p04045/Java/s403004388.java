import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] ds = new int[K];
        for (int i = 0; i < K; i++) {
            ds[i] = sc.nextInt();
        }
        System.out.println( solve(N, ds) );
    }

    private static int solve(int N, int[] ds) {
        Set<Integer> hateDigits = new HashSet<>();
        for (int d : ds) {
            hateDigits.add(d);
        }

        int keta = 1;
        int n = N;
        while(true) {
            int c = ketaNum(n, keta);

            if( hateDigits.contains(c) ) {
                n = n + (int)Math.pow(10, keta - 1);

            } else {
                if( maxKeta(n) == keta ) return n;
                keta++;
            }
        }
    }

    // 桁も数字もdigitなんだけど、どういうネーミングがよいのか
    private static int ketaNum(int n, int keta) {
        int r = n % (int)(Math.pow(10, keta));
        return r / (int)(Math.pow(10, keta - 1));
    }

    private static int maxKeta(int n) {
        // oh...
        return String.valueOf(n).length();
    }
}
