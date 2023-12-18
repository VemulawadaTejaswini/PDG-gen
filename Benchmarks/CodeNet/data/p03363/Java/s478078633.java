import java.util.*;
import java.io.*;
 
public class Main{
    ArrayList<Long> list;
    HashMap<Long,Integer> map;
    long ltotal,rtotal,maximum;
    long ans;
    
    public static void main(String[] args){
        Main m = new Main();
        m.input();
        m.solve();
    }
 
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ltotal = 0;
        rtotal = 0;
        ans = 0;
        maximum = 1000000000;
        list = new ArrayList<Long>();
        map = new HashMap<Long,Integer>();
        rmap = new HashMap<Long,Integer>();
        for(int i = 0; i < n; i++){
            long num = sc.nextLong();
            list.add(num);
            ltotal += num;
            if(ltotal == 0){
                if(map.containsKey(maximum)){
                    int tmp = map.get(maximum) + 1;
                    map.put(maximum,tmp);
                }else{
                    map.put(maximum,1);
                }
            }
            if(map.containsKey(ltotal)){
                int tmp = map.get(ltotal) + 1;
                map.put(ltotal,tmp);
            }else{
                map.put(ltotal,1);
            }
        }
        sc.close();
    }
    

    public void solve(){
        int max = list.size();
        long now = 0;
        for(int i = 0; i < max; i++){
            now = now + list.get(i);
            
            if(map.containsKey(now)){
                int tmp = map.get(now) - 1;
                if(tmp >= 0){
                    map.put(now,tmp);
                }
            }
            if(map.containsKey(now)){
                int tmp = map.get(now);
                ans += tmp;
            }
        }
        System.out.println(ans);
    }
    
}