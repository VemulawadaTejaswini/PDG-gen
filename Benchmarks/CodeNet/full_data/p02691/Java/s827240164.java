import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(-first,1);
        long ans = 0;
        for(int i = 1; i < n; i++){
            int v = sc.nextInt();
            int cnt = i-v;
            int key = i+v;
            if(map.containsKey(cnt)){
                ans += map.get(cnt);
            }else{
                map.put(cnt,1);
            }
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        System.out.println(ans);
    }
}

