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
            int temp;
            temp = nCrModpDP((N-K)+1,i,mod);
            temp = (temp * nCrModpDP(K-1,i-1,mod))% mod;
            System.out.println(temp);
        }

    }

    static int nCrModpDP(int n, int r, int p)
    {
        // The array C is going to store last row of
        // pascal triangle at the end. And last entry
        // of last row is nCr
        int[] C=new int[r+1];

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



}
