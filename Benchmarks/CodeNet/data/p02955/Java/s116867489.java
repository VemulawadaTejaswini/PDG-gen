import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long[] nums = new long[N];
        long sum=0;
        for (int i = 0; i < N; i++) {
            nums[i]= sc.nextInt();
            sum += nums[i];
        }

        List<Long> fac = new ArrayList<>();
        for(int i=1 ; i *i <= sum ; i++){
            if(sum %i ==0){
                fac.add((long)i);
                fac.add(sum/i);
            }
        }

        long ans =1;
        for (int i = 0; i < fac.size(); i++) {
            long x = fac.get(i);
            int need = 0;
            long[] mods = new long[nums.length];
            long diffSum = 0;
            for (int j = 0; j < nums.length; j++) {
                mods[j]= nums[j]%x;
                diffSum+=mods[j];
            }
            Arrays.sort(mods);
            long idx = diffSum/x;
            for (int j = 0; j < mods.length-idx ; j++) {
                need += mods[j];
            }
            if(need <=K){
                ans = Math.max(ans,x);
            }
        }

        System.out.println(ans);
    }
}
