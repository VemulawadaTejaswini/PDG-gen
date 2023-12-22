import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int x =0;x<N; x++){
            A[x] = scanner.nextInt();
        }
        BigInteger count = BigInteger.valueOf(0);
        for(int x = 0;x<N-1; x++){
            for(int y = x+1; y<N; y++){
                count = count.add(BigInteger.valueOf(A[x]).multiply(BigInteger.valueOf(A[y])));
            }
        }
        System.out.println(count.mod(BigInteger.valueOf((int) Math.pow(10,9)+7)));

    }
}
