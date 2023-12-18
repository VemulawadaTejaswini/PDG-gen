// AtCoder Regular Contest 078 C - Splitting Pile
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] sums = new long[n];
        sums[0] = scan.nextInt();
        for(int i = 1; i < n; i++){
            sums[i] = scan.nextInt() + sums[i - 1];
        }

        long halfSum;
        int oddSum;
        if(0 <= sums[n - 1]){
            halfSum = sums[n - 1] / 2;
            oddSum = (int) (sums[n - 1] % 2);
        }else{
            halfSum = - (- sums[n - 1]) / 2;
            oddSum = (int) (- (- sums[n - 1]) % 2);
            halfSum = halfSum - oddSum;
        }

        long halfSplitMin;
        if(sums[0] <= halfSum){
            halfSplitMin = halfSum - sums[0];
        }else{
            halfSplitMin = sums[0] - halfSum - oddSum;
        }

        for(int i = 1; i < n - 1; i++){
            long m;
            if(sums[i] <= halfSum){
                m = halfSum - sums[i];
            }else{
                m = sums[i] - halfSum - oddSum;
            }
            halfSplitMin = Math.min(m, halfSplitMin);
        }

        long splitMin = halfSplitMin*2 + oddSum;
        System.out.println(splitMin);
    }
}
