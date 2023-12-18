import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            String as = "" + a;
            map.put(as, a);
        }
        for(int i = 0; i<m; i++){
            int bi = sc.nextInt();
            String b = ""+ bi;
            if(map.get(b)==null){
                int tttt = sc.nextInt();
                continue;
            }
            int c = sc.nextInt();
            int max = map.get(b);
            max = max(max, c);
            map.put(b, max);
        }
        long sum =0l;
        for(String key: map.keySet()){
            sum += map.get(key);
        }
        System.out.println(sum);
    }
}
    