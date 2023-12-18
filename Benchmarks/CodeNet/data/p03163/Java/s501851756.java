import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int W = sc.nextInt();

        long[] w = new long[N];
        long[] v = new long[N];
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long ans = rec(w,v,0,W);

        System.out.println(ans);
    }


    static Map<String,Long> m = new HashMap<>();
    static
    long rec(long[] w,long[] v ,int i, long W){

        if(i==w.length) return 0;

        String key = new StringBuilder(new Integer(i).toString()).append(" ").append(W).toString();
        if(m.containsKey(key)){
            return m.get(key);
        }


        long max = -1;
        //use
        if(W-w[i]>=0){
            max = Math.max(max, rec(w,v,i+1,W-w[i] ) +v[i] );
        }
        //not use
        max = Math.max(max,rec(w,v,i+1, W));

        m.put(key,max);

        return max;


    }

}