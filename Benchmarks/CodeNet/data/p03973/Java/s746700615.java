import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        long ans = A[0]-1;
        int max = 2;
        for (int i=1;i<N;i++) {
            if (A[i]==max) max++;
            else if (A[i]>max) {
                ans+=(A[i]-1)/max;
            }
        }
        System.out.println(ans);
    }
}