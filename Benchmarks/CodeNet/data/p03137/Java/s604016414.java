import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        for(int i = 0; i < M; i++){
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);
        int[] diff = new int[M-1];
        long ans = 0;
        if(N < M){
            for(int i = 0; i < M -1; i++){
                diff[i] = Math.abs(X[i +1] - X[i]);
                ans += diff[i];
            }
            Arrays.sort(diff);
            for(int i = M-2; i > M-2-(N-1); i--){
                ans -= diff[i];
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
