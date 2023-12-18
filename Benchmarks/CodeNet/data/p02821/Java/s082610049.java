import java.util.*;

class Pair {
    long tot;
    long num;
    public Pair (long tot, long num) {
        this.tot = tot;
        this.num = num;
    }
}

class Main {

   private static int binarySearch(int[] A, long v) {
        int n = A.length;
        int left = 0;
        int right = A.length;
        if (A[n - 1] < v){
            return n;
        }   
        if (A[0] >= v){
            return 0;
        }   
    
        // lower_bound
        while (left < right) {
            int mid = (right + left) / 2;
            if (A[mid] < v){ 
                left = mid + 1;
            } else {
                right = mid;
            }   
        }   
        return left;
    }   

    private static Pair calc(int N, int[] A, long[] S, int x) {
        long tot = 0;
        long num = 0;
        // i 行目: 片手を a[i]で固定している。
        // O(nlog(n))
        for (int i = 0; i < N; i++) {
            int j = binarySearch(A, x - A[i]); // x - A[i] 以上の最小値indを求める。超えない場合は n が返ってくる
            num += N - j;                      // x - A[i] が x を超えない場合は右辺は0になる
            tot += (long)(S[N] - S[j]);        // x - A[i] が x を超えない場合は右辺は0になる
            tot += (long)A[i] * (long)(N - j); // x - A[i] が x を超えない場合は、n-jが0だから、0になる
        }
        return new Pair(tot, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // O(nlog(n))
        Arrays.sort(A);

        // cumulative summation
        long[] S = new long[N + 1];
        S[0] = 0;
        for (int i = 0; i < N; i++) {
            S[i + 1] = S[i] + A[i];
        }

        int l = 0;
        int r = 200005;
        while (l + 1 < r) {
            int c = (l + r) >> 1;
            if (calc(N, A, S, c).num >= M) l = c;
            else r = c;
        }

        Pair p = calc(N, A, S, l);
        long ans = p.tot;
        ans -= ((p.num - M) * (long)l); // Mからはみ出た部分を引く。
        System.out.println(ans);

        return;
    }
}