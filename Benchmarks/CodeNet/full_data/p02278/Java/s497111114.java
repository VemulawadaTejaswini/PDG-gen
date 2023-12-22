import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] w = new int[n];
        int x = 10000;
        for(int i = 0; i < n; i++){
            w[i] = Integer.parseInt(sc.next());
            if(w[i] < x) x = w[i];
        }
        
        int[] w2 = w.clone();
        Arrays.sort(w2);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(w2[i], i);
        }
        
        int ans = 0;
        boolean[] done = new boolean[n];
        for(int i = 0; i < n; i++){
            if(done[i]) continue;
            List<Integer> list = new ArrayList<>();
            list.add(i);
            done[i] = true;
            int j = map.get(w[i]);
            while(j != i){
                list.add(j);
                done[j] = true;
                j = map.get(w[j]);
            }
            int sum = 0;
            int min = 10000;
            for (Integer k : list) {
                sum += w[k];
                if(w[k] < min) min = w[k];
            }
            ans += Math.min(sum + (list.size()-2) * min, sum + min + (list.size()+1) * x);
        }
        
        System.out.println(ans);
    }
}
