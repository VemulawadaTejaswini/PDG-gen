
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<n;i++){
            int a = s.nextInt();
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else {
                map.put(a,map.get(a)+1);
            }
//            sum+=arr[i];
        }
        //System.out.println(map);
        int q = s.nextInt();
        for(int i = 0;i<q;i++){
            long sum = 0;
            int t = s.nextInt();
            int k =s.nextInt();
            int val;
            if(map.containsKey(t)) {
                val = map.get(t);
                map.remove(t);
                if (map.containsKey(k)) {
                    map.put(k, map.get(k) + val);
                } else map.put(k, val);
//            System.out.println(map);
            }
            for(int j:map.keySet()){
                sum+=j*map.get(j);
            }
            System.out.println(sum);
        }
    }
}
