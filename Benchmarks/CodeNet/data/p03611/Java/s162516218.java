import java.util.*;
import java.util.TreeMap;
import java.util.Map;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int min = 1000001;
        int max = 0;
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for(int i=min-1; i<=max+1; i++){
            map.put(i, 0);
        }
        for(int i=0; i<N; i++){
            map.put(a[i], map.get(a[i]) + 1);
        }
        int ans = 0;
        for(int i=min; i<=max; i++){
            ans = Math.max(ans, map.get(i - 1) + map.get(i) + map.get(i + 1));
        }
        System.out.println(ans);
    }
}