import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] li = new long[n];
        for(int i = 0; i < n; i++){
            li[i] = sc.nextLong();
        }
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < n-k+1; i++){
            long min = Math.min(Math.abs(li[i]),Math.abs(li[i+k-1])); 
            long max = Math.max(Math.abs(li[i]),Math.abs(li[i+k-1])); 
            if(li[i] < 0 && li[i+k-1] > 0){
                ans = Math.min(ans, max+min*2);
            }else{
                ans = Math.min(ans, max);
            }
        }
        System.out.println(ans);
    }
}