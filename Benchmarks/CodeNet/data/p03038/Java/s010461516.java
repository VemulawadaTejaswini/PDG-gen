import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long sum = 0l;
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
            }else{
                int tttt = sc.nextInt();
                sum += tttt;
            }
            int c = sc.nextInt();
            int max = map.get(b);
            max = max(max, c);
            map.put(b, max);
        }
        for(String key: map.keySet()){
            sum += map.get(key);
        }
        System.out.println(sum);
    }
}
    