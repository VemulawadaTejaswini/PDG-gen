import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] A = new long[N];

        for(int i=0; i<N; i++){
            A[i] = scanner.nextLong();
        }

        long x2 = 0;
        for(int i=0; i<N; i++){
            if(i%2 == 0){
                x2 += A[i];
            }else{
                x2 -= A[i];
            }
        }

        x2 /= 2;


        long[] ans = new long[N];

        ans[0] = x2;

        for(int i=1; i<N; i++){
            ans[i] = A[i-1] - ans[i-1];
        }

        for(int i=0; i<N; i++){
            if(i != 0){
                System.out.print(" ");
            }
            System.out.print(2*ans[i]);
        }
        System.out.println();
    }

    static List<Integer> primeList(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!prime[i]) continue;
            for (int j = 2; i * j <= n; j++) {
                prime[i * j] = false;
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) list.add(i);
        }

        return list;
    }
}
