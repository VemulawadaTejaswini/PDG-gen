import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        long S = 0;
        long A[] = new long[N];
        Map<Long, Long> p = new HashMap();

        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
            if (p.containsKey(A[i])) {
                p.put(A[i], p.get(i) + 1);
            } else {
                p.put(A[i], (long)1);
            }

            S = S + A[i];
        }

        int Q = scan.nextInt();
        long B[] = new long[Q];
        long C[] = new long[Q];

        for (int i = 0; i < Q; i++) {
            B[i] = scan.nextLong();
            C[i] = scan.nextLong();

        }
        for (int i = 0; i < Q; i++) {
            if (p.containsKey(B[i])) {
                S = S + ( C[i]-B[i]) * p.get(B[i]);
              if(p.containsKey(C[i])) { p.put(C[i],p.get(C[i])+p.get(B[i]));}
              else{p.put(C[i],p.get(B[i]));}
              p.put(B[i],0);
            }
            System.out.println(S);
        }
    }


}