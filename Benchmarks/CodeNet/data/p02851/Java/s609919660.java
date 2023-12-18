import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Integer.parseInt(sc.next());
        long[] sum = new long[n+1];
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
            sum[i+1] = sum[i] + a[i];
        }

        Map<Long,Integer> map = new HashMap<>();
        int right  = 0;
        long res = 0;
        for(int left = 0;right <= n;left++){
            while(right-left<k && right<=n){
                Long val = (sum[right]-right)%k;
                Integer count = map.get(val);
                if(count == null){
                    map.put(val,1);
                }else{
                    map.put(val,count+1);
                    res+=count;
                }
                right++;
            }
            Long val = (sum[left]-left)%k;
            Integer count = map.get(val);
            map.put(val,count-1);
        }

        System.out.println(res);
    }
    
}