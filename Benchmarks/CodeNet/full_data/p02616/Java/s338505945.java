import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n;
    static int k;
    static long[] ai = null;
    static final long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        ai = new long[n];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for(int i=0; i<n; i++) {
            ai[i] = in.nextLong();
            if(ai[i] < 0) {
                negativeCount++;
            }
            else if(ai[i] > 0) {
                positiveCount++;
            }
            else {
                zeroCount++;
            }
        }
        Arrays.sort(ai);
        List<Long> candidates = new ArrayList<>(k);
    
        // negativeから奇数個選ばなければならないとき、正にできない
        // 正の値にすることが不可能なとき：0にする or 絶対値が小さいものを狙う
        if(negativeCount>0 && (k-positiveCount)%2 != 0) {
            if(zeroCount > 0) {
                // 0にできるので0にする
                candidates.add(0L);
            }
            else {
                // 0にできないので、絶対値が小さくなるように
                int negativeIndex = negativeCount-1;
                int positiveIndex = negativeCount; // ∵ zeroCount==0
                for(int i=0; i<k; i++) {
                    long negativeNext = negativeIndex>=0 ? ai[negativeIndex] : Long.MIN_VALUE;
                    long positiveNext = positiveIndex<n ? ai[positiveIndex] : Long.MAX_VALUE;
                    if(Math.abs(negativeNext) < positiveNext) {
                        candidates.add(negativeNext);
                        negativeIndex--;
                    }
                    else {
                        candidates.add(positiveNext);
                        positiveIndex++;
                    }
                }
            }
        }
        else {
            // 絶対値が大きくなるように頑張る
            int negativeIndex = 0;
            int positiveIndex = n-1;
            for(int i=0; i<k; i++) {
                long negativeNext = negativeIndex<negativeCount ? ai[negativeIndex] : 0;
                long negativeNext2 = (negativeIndex+1)<negativeCount ? ai[negativeIndex+1] : 0;
                long positiveNext = positiveIndex>=(negativeCount+zeroCount) ? ai[positiveIndex] : 0;
                long positiveNext2 = (positiveIndex-1)>=(negativeCount+zeroCount) ? ai[positiveIndex-1] : 0;
                if(i==k-1) {
                    candidates.add(positiveNext);
                }
                else {
                    if(negativeNext * negativeNext2 > positiveNext * positiveNext2) {
                        candidates.add(negativeNext);
                        candidates.add(negativeNext2);
                        negativeIndex+=2;
                    }
                    else {
                        candidates.add(positiveNext);
                        candidates.add(positiveNext2);
                        positiveIndex-=2;
                    }
                    i++;
                }
            }
        }
        long ans = 1;
        for(int i=0; i<candidates.size(); i++) {
            ans *= candidates.get(i);
            ans = ans % MOD;
        }
        if(ans<0) {
            ans += MOD;
        }
        System.out.println(ans);
    }
}
