import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];

        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextLong();
        }

        int[] now = new int[N];
        for(int i = 0 ; i < N ; i++){
            now[i] = i;
        }
        
        long ans = 0;
        boolean changed = true;
        while(changed) {
            changed = false;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    long var = A[i] * Math.abs(i - now[j]) + A[j] * Math.abs(j - now[i]) -
                            (A[i] * Math.abs(i - now[i]) + A[j] * Math.abs(j - now[j]));
                    if (var > 0) {
                        int tmp = now[j];
                        now[j] = now[i];
                        now[i] = tmp;
                        ans += var;
                        changed = true;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
