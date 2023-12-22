
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
        List<Long> negativesCum = new ArrayList<>();
        List<Long> positivesCum = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.valueOf(s2[i]);
            int temp = Integer.parseInt(s2[i]);
            if (temp<0)negatives.add((long) temp);
            else  positives.add((long) temp);
        }

        int posCount  = Math.min(k,positives.size());
        int negCount =  k - posCount;

        if (negCount%2==0){
            // negcount either 0, or an even number of negatives needed => positive sing = > select negatives or positives in groups of two (by whichever pair has higher product)

            positives.sort(Collections.reverseOrder());
            Collections.sort(negatives);

            int negIdx = 0;
            int posIdx = 0;
            int total = 0;
            long ans  = 1L;
            while (negIdx+1<negatives.size() && posIdx+1<positives.size() && total+2 <=k){

                long negProd = negatives.get(negIdx)*negatives.get(negIdx+1);
                long posProd = positives.get(posIdx)*positives.get(posIdx+1);


                ans = (ans * Math.max(negProd,posProd))%MOD;
                if(negProd>posProd)
                    negIdx += 2;
                else
                    posIdx += 2;
                total += 2;
            }
            while (total < k && posIdx<positives.size()) {
                ans = (ans * positives.get(posIdx)) % MOD;
                ++total;
                ++posIdx;
            }
            while (total < k && negIdx<negatives.size()) {
                ans = (ans * negatives.get(negIdx)) % MOD;
                ++total;
                ++negIdx;
            }

            System.out.println(ans);
        }else{
            // sign will be negative, hence choose smallest k numbers(by abs value).

            Arrays.sort(nums, (a, b)->Math.abs(a)-Math.abs(b));
            long ans = 1L;
            for(int i = 0 ; i<k; i++){
                ans = (ans*nums[i])%MOD;
            }
            System.out.println((ans+MOD)%MOD);
        }

    }
}
