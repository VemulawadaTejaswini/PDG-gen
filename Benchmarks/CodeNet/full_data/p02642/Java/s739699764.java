import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final List<List<Integer>> factors = new ArrayList<>();
    private static final int MAX = 1000000;
    public static void main(String args[]) throws Exception {
        int n = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        int[] freq = new int[MAX+1];
        int[] nums = new int[n];
        int max = 1;
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(tokens[i]);
            max = Math.max(nums[i],max);
            freq[nums[i]]++;
        }
        process(max);
        int count=0;
        if(freq[1]>0){
            System.out.println(count);
        }else{
            for(int i=0;i<n;i++){
                boolean flag = true;
                for(int factor : factors.get(nums[i])){
                    if((factor==nums[i] && freq[factor]>1) || (factor!=nums[i] && freq[factor]>0)){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    count++;
            }
            System.out.println(count);
        }

    }

    private static void process(int MAX){
        for(int i=0;i<=MAX;i++){
            factors.add(new ArrayList<>());
        }
        for(int i=1;i<=MAX;i++){
            for(int j=i;j<=MAX;j+=i){
                factors.get(j).add(i);
            }
        }
    }



    private static class Pair{
        int first,second;

        public Pair(int first,int second){
            this.first = first;
            this.second = second;
        }

        public int hashCode(){
            return Objects.hash(first,second);
        }

        public boolean equals(Object obj){
            if(obj!=null || !(obj instanceof  Pair))
                return false;
            Pair pair = (Pair)obj;
            return pair.first == first && pair.second == second;
        }
    }




}