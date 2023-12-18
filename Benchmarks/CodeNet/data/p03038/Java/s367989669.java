import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean p[] = new boolean[1000000001];
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            String as = "" + a;
            map.put(as, a);
            p[a] = true;
        }
        for(int i = 0; i<m; i++){
            String b = sc.next();
            if(!p[Integer.parseInt(b)]) {
                int ctt = sc.nextInt();
                continue;
            }
            // p[Integer.parseInt(b)] = true;
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
    