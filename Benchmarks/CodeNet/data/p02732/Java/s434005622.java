import java.util.*;

public class Main {
    private static final long MODVAL = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int count[] = new int[N+1];
        long total = 0L;
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            total += count[A[i]];
            count[A[i]]++;
        }
        for(int i=0; i<N; i++) {
            System.out.println(total - (count[A[i]]-1));
        }
     }
}
