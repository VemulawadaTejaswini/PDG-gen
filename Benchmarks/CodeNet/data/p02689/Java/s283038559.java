import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] H = new int[N+1];
        Map<Integer, List<Integer>> mp = new HashMap<>();
        str = br.readLine().split(" ");
        for(int i=1; i<=N; ++i) {
            H[i] = Integer.parseInt(str[i - 1]);
            mp.putIfAbsent(i,null);
        }
        int res=0;

        while(M-- != 0){
            str = br.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            mp.putIfAbsent(u, new ArrayList<>());
            mp.putIfAbsent(v, new ArrayList<>());
            mp.get(u).add(v);
            mp.get(v).add(u);
        }
        for(int k : mp.keySet()){
            if(mp.get(k) == null){
                res++;
                continue;
            }
            boolean ok = true;
            for(int i=0; i<mp.get(k).size(); ++i){
                if(H[k] < mp.get(k).get(i)){
                    ok = false;
                    break;
                }
            }
            if(ok) res++;
        }
        System.out.println(res);
    }
}
