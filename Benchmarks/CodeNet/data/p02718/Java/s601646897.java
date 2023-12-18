import java.util.*;
public class Main {
    static final long MODVAL = 998244353L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        int total = 0;
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            total+=A[i];
        }
        int threshold = 4 * M * total;
        int okcount = 0;
        for(int i=0; i<N; i++) {
            if(total <= 4 * M * A[i]) okcount++;
        }
        System.out.println(okcount>=M ? "Yes" : "No");
    }
}
