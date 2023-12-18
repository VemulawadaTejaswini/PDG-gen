import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int K;
        int mod = 1000_000_007;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            K = sc.nextInt();
        }


        int result = 0;
        for(int i = 1;i< K+1;i++){
            long temp;
            temp = nCrModpLucas((N-K)+1,i,mod);
            temp = (temp * nCrModpLucas(K-1,i-1,mod))% mod;
            System.out.println(temp);
        }

    }

    static long nCrModpDP(int n, int r, int p)
    {
        // The array C is going to store last row of
        // pascal triangle at the end. And last entry
        // of last row is nCr
        long[] C=new long[r+1];

        C[0] = 1; // Top row of Pascal Triangle

        // One by constructs remaining rows of Pascal
        // Triangle from top to bottom
        for (int i = 1; i <= n; i++)
        {
            // Fill entries of current row using previous
            // row values
            for (int j = Math.min(i, r); j > 0; j--)

                // nCj = (n-1)Cj + (n-1)C(j-1);
                C[j] = (C[j] + C[j-1])%p;
        }
        return C[r];
    }

    static long nCrModpLucas(int n, int r, int p)
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
    return (nCrModpLucas(n/p, r/p, p) * // Last digits of n and r
            nCrModpDP(ni, ri, p)) % p; // Remaining digits
    }



}
