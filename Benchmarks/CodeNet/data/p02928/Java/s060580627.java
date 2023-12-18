import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scanner.nextInt();
        long K = scanner.nextLong();
        long[] A = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        long countInversions = 0;
        for(int i = 0; i < N; i++){
            long innerCount = 0;
            for(int j = i + 1; j < N; j++){
                if(A[i] > A[j]){
                    innerCount++;
                }
            }
            countInversions = countInversions + innerCount * K;
        }
        Arrays.sort(A);
        int i = 0;
        long mod = (long)(Math.pow(10, 9) + 7);
        while(i < N){
            int start = i;
            while(i < N && A[start] == A[i]){
                i++;
            }
            long temp = (i - start);

            long add = temp*start*(K - 1)*(K)/2;
            add = add % mod;
            countInversions = countInversions % mod;

            countInversions = (countInversions + add) % mod;
        }
        System.out.println(countInversions);

    }
}
