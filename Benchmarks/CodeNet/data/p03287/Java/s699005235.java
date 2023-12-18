import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        long[] sum = new long[N];
        for(int i = 0;i < N;i++){
            if(i == 0)  sum[i] = sc.nextInt();
            else    sum[i] = sc.nextInt()+sum[i-1];
        }
        Map<Integer, Integer> modN = new HashMap<>();
        for(int i = 0;i < N;i++){
            int r = (int)(sum[i]%M);
            if(!modN.containsKey(r)) modN.put(r, 1);
            else    modN.put(r, modN.get(r)+1);
        }
        long ans = 0;
        for(Integer key : modN.keySet()){
            int value = modN.get(key);
            if(key == 0)    ans += value;
            ans += value*(value-1)/2;
        }
        System.out.println(ans);
    }
}