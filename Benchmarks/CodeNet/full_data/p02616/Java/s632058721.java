
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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

        if(positives.size()==0 && k%2==1){
            Arrays.sort(nums);
            long curr = 1L;
            //for (int i = 0; i < k; i++) {
            for (int i = n-1; i >=n-k; i--) {
                curr = ((curr * nums[i])+MOD)%MOD;
            }
            System.out.println((curr+MOD)%MOD);
            return;
        }else if(positives.size()==0 && k%2==0){
            Arrays.sort(nums);
            long curr = 1L;
            //for (int i = n-1; i >=0; i--) {
            for (int i = 0; i < k; i++) {
                curr = (curr * nums[i])%MOD;
            }
            System.out.println((curr)%MOD);
            return;
        }
        positives.sort(Collections.reverseOrder());
        Collections.sort(negatives);

        Arrays.sort(nums, (a, b) -> Math.abs(a) - Math.abs(b));

        long curr = 1L;
        for (Long positive : positives) {
            curr = (curr * positive)%MOD;
            positivesCum.add(curr);
        }
        curr = 1L;
        for (Long negative : negatives) {
            curr = ((curr * negative))%MOD ;
            negativesCum.add(curr);
        }

        long result = Long.MIN_VALUE;


        if(negatives.size()==0){
            Arrays.sort(nums);
            long curr2 = 1L;
            for (int i = n-1; i >=n-k; i--) {
            //for (int i = 0; i < k; i++) {
                curr2 = (curr2 * nums[i])%MOD;
            }
            System.out.println((curr2)%MOD);
            return;
        }
        for(int i=0;i<=k;i+=2){
            if((k-i)>positives.size())continue;

            long negativeContribution =  i-1>=0?negativesCum.get(i-1):1;

            long positiveContribution = (k-i-1)>=0?positivesCum.get(k-i-1):1;

            long answer = (negativeContribution * positiveContribution)%MOD;
           // System.out.println(answer+ " " + negativeContribution + " " +positiveContribution + " for i  = "+i);
            result = Math.max(answer,result);
        }

        System.out.println((result+MOD)%MOD);
    }
}