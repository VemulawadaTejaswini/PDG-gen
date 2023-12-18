import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        for(int i=0;i<N;i++){
            w[N-i-1] = sc.nextInt();
            v[N-i-1] = sc.nextInt();
        }

        System.out.println(func(w,v,N, W ,0));
    }

    static Map<Integer, Map<Integer,Long>>  cache = new HashMap<>();
    static private long func(int[] w, int[] v,int N , int W , int idx){
        if(idx == N ) return 0;

        if(cache.containsKey(W)){
            Map<Integer,Long> map = cache.get(W);
            if(map.containsKey(idx)){
                return map.get(new Integer(idx));
            }
        }


        if(W-w[idx] < 0){
            long result = func(w,v,N, W, idx +1  );
            if(!cache.containsKey(W)){
                Map<Integer,Long> map = new HashMap<>();
                map.put(idx,result);
                cache.put(W,map);
            }else{
                Map<Integer,Long> map = cache.get(W);
                map.put(idx,result);
                cache.put(W,map);
            }
            return result;
        }

        long result =  Math.max(
                func(w,v,N, W- w[idx], idx +1  )  + v[idx] ,
                func(w,v,N, W, idx +1  ));

        if(!cache.containsKey(W)){
            Map<Integer,Long> map = new HashMap<>();
            map.put(idx,result);
            cache.put(W,map);
        }else{
            Map<Integer,Long> map = cache.get(W);
            map.put(idx,result);
            cache.put(W,map);
        }

        return result;

    }

}
