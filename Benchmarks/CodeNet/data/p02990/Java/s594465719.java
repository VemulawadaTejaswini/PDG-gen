import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    static long[] C1;
    static long[] C2;


    public static void main(String[] args) {

        int N;
        int K;
        int mod = 1000_000_007;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            K = sc.nextInt();
        }
        C1 = new long[N+1];
        C2 = new long[K+1];

        C1[0] = 1;
        C2[0] = 1;

        for (int i = 1; i <= (N-K)+1; i++)
        {
            // Fill entries of current row using previous
            // row values
            for (int j = (N-K)+1; j > 0; j--){
                // nCj = (n-1)Cj + (n-1)C(j-1);
                C1[j] = (C1[j] + C1[j-1])%mod;
            }
        }
        for (int i = 1; i <= K-1; i++)
        {
            // Fill entries of current row using previous
            // row values
            for (int j = K-1; j > 0; j--){
                // nCj = (n-1)Cj + (n-1)C(j-1);
                C2[j] = (C2[j] + C2[j-1])%mod;
            }
        }

        for(int i = 1;i< K+1;i++){
            long temp;
            temp = nCrModpLucas1((N-K)+1,i,mod);
            temp = (temp * nCrModpLucas2(K-1,i-1,mod))% mod;
            System.out.println(temp);
        }

    }


    static long nCrModpLucas1(int n, int r, int p)
    {
    // Base case
    if (r==0)
        return 1;

    // Compute last digits of n and r in base p
    int ni = n%p;
    int ri = r%p;

    // Compute result for last digits computed above, and
    // for remaining digits. Multiply the two results and
    // compute the result of multiplication in modulo p.
    return (nCrModpLucas1(n/p, r/p, p) * // Last digits of n and r
            C1[ri]) % p; // Remaining digits
    }

    static long nCrModpLucas2(int n, int r, int p)
    {
    // Base case
    if (r==0)
        return 1;

    // Compute last digits of n and r in base p
    int ni = n%p;
    int ri = r%p;

    // Compute result for last digits computed above, and
    // for remaining digits. Multiply the two results and
    // compute the result of multiplication in modulo p.
    return (nCrModpLucas2(n/p, r/p, p) * // Last digits of n and r
            C2[ri]) % p; // Remaining digits
    }



}
