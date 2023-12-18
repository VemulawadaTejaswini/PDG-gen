import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M+1];
        int[] R = new int[M+1];
        int[] countID = new int[N+1];

        for(int i=1; i<=M; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        sc.close();

        for(int i=1; i<=M; i++){
            for(int j=L[i]; j <= R[i]; j++){
                countID[j]++;
            }
        }

        int ans=0;
        for(int i=1; i<=N; i++){
            if(countID[i] == M){
                ans++;
            }
        }

        System.out.println(ans);

    }
}