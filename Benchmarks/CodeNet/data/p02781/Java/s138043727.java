// Java Program to find the count of
// numbers in a range where the number
// does not contain more than K non
// zero digits
import java.util.*;
public class Main
{
    static final int M = 20;

    // states - position, count, tight
    static int dp[][][]= new int[M][M][2];

    // K is the number of non zero digits
    static int K;
    static Vector<Integer> num;

    // This function returns the count of
// required numbers from 0 to num
    static int countInRangeUtil(int pos, int cnt, int tight )
    {
        // Last position
        if (pos == num.size()) {
            // If count of non zero digits
            // is less than or equal to K
            if (cnt == K)
                return 1;
            return 0;
        }

        // If this result is already computed
        // simply return it
        if (dp[pos][cnt][tight] != -1)
            return dp[pos][cnt][tight];

        int ans = 0;

        // Maximum limit upto which we can place
        // digit. If tight is 1, means number has
        // already become smaller so we can place
        // any digit, otherwise num[pos]
        int limit = (tight!=0 ? 9 : num.get(pos));

        for (int dig = 0; dig <= limit; dig++) {
            int currCnt = cnt;

            // If the current digit is nonzero
            // increment currCnt
            if (dig != 0)
                currCnt++;

            int currTight = tight;

            // At this position, number becomes
            // smaller
            if (dig < num.get(pos))
                currTight = 1;

            // Next recursive call
            ans += countInRangeUtil(pos + 1, currCnt, currTight);
        }
        return dp[pos][cnt][tight] = ans;
    }

    // This function converts a number into its
// digit vector and uses above function to compute
// the answer
    static int countInRange(int x)
    {
        num= new Vector<Integer>();
        while (x!=0) {
            num.add(x % 10);
            x /= 10;
        }
        Collections.reverse(num);

        // Initialize dp
        for(int i=0;i<M;i++)
            for(int j=0;j<M;j++)
                for(int k=0;k<2;k++)
                    dp[i][j][k]=-1;
        return countInRangeUtil(0, 0, 0);
    }

    // Driver Code to test above functions
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int L = 0, R = sc.nextInt();
        K = sc.nextInt();
        System.out.println( countInRange(R) - countInRange(L - 1) );

    }
}
