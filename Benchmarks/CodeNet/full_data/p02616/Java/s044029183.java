
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        String[] s2 = br.readLine().split(" ");
        Integer[] nums = new Integer[n];
        List<Long> positives = new ArrayList<>();
        List<Long> negatives = new ArrayList<>();

        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(Integer.parseInt(s2[i]));
            int temp = Integer.parseInt(s2[i]);
            if (temp<0)negatives.add((long) temp);
            else if (temp==0){
                ++zeroCount;
            }
            else  positives.add((long) temp);
        }

        boolean isPositive = positives.size() + ((int)(negatives.size()/2))*2 >= k && (k%2 == 0 || positives.size() > 0);


        if (isPositive){
            //positive sing = > select negatives or positives in groups of two (by whichever pair has higher product) and mul 1 more pos at the end if k nos not taken

            positives.sort(Collections.reverseOrder());
            negatives.sort(Collections.reverseOrder());

            int negIdx = 0;
            int posIdx = 0;
            int total = k;
            long ans  = 1L;
            if(k%2==1){
                ans = positives.get(posIdx);
                ++posIdx;
                --total;
            }
            while (total>0){

                long negProd = negIdx+1<negatives.size() ? (negatives.get(negIdx)*negatives.get(negIdx+1))%MOD : Long.MIN_VALUE;
                long posProd = posIdx+1<positives.size() ? (positives.get(posIdx)*positives.get(posIdx+1))%MOD : Long.MIN_VALUE;


                ans = (ans * Math.max(negProd,posProd))%MOD;
                if(negProd>posProd)
                    negIdx += 2;
                else
                    posIdx += 2;
                total -= 2;
            }
            System.out.println(ans);
        }else{
            // sign will be negative, hence choose smallest k numbers(by abs value).
            if(zeroCount>0){
                System.out.println(0);
                return;
            }
            Arrays.sort(nums);
            long ans = 1L;
            for(int i = 0 ; i<k; i++){
                ans = (ans*nums[i])%MOD;
            }
            System.out.println((ans+MOD)%MOD);
        }

    }
}