import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        // abc 129 C

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] brokenSteps = new int[m];

        brokenSteps[0] = sc.nextInt();

        for (int i = 1; i < m; i++) {
            brokenSteps[i] = sc.nextInt();
            if (brokenSteps[i] - brokenSteps[i - 1] == 1) {
                // 壊れている段が連続している場合は最上段に到達できない
                System.out.println(0);
                return;
            }
        }

        // 壊れている段を跨ぐ場合は全ての場合で2固定なので検討不要
        // 検討すべき段数をまず出し、その中で含まれる可能性のある最大の2の個数とその場合含まれる1の個数でありえる組み合わせが出せる
        // 後は2の個数を一つずつ減らしてその場合有りえる組み合わせを計算して足していく
        // 真面目にやってると遅すぎて間に合わなそうなので計算の省略を考える
        long ans = 1;
        int start = 0;
        int mod = 1000000007;
        for (int i = 0; i < m; i++) {
            int end = brokenSteps[i] - 1;
            if (end > start) {
                int valid = end - start;
                int max2 = valid / 2;
                int pattern = 0;
                for (int j = 0; j <= max2; j++) {
                    int mother = (valid - 2 * j) + j;
                    pattern += nCk(mother, j, mod);
                }
                ans *= pattern;
                ans %= mod;
            }
            start = end + 2;
        }
        int lastStart = brokenSteps[m - 1] + 1;
        int valid = n - lastStart;
        int max2 = valid / 2;
        int pattern = 0;
        for (int j = 0; j <= max2; j++) {
            int mother = (valid - 2 * j) + j;
            pattern += nCk(mother, j, mod);
        }
        ans *= pattern;
        System.out.println(ans % mod);
    }

    //return nCk mod M (M must be prime number) O(min(k,n-k)*logM)
    public static int nCk(int n,int k,int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return (int)ret;
    }

    //return a^b mod M O(logB)
    public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
}