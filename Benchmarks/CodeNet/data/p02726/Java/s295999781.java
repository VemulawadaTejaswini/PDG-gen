import java.util.*;
import java.util.TreeMap;
import java.util.Map;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        
        for(int i=1; i<=N-1; i++){
            map.put(i, 0);
        }
        for(int i=1; i<=N-1; i++){
            for(int j=i+1; j<=N; j++){
                int r = Math.min(j - i, Math.abs(X - i) + Math.abs(j - Y) + 1);
                r = Math.min(r, Math.abs(Y - i) + Math.abs(j - X) + 1);
                if(map.containsKey(r)){
                    map.put(r, map.get(r) + 1);
                }
                else{
                    map.put(r, 1);
                }
            }
        }
        for(int x : map.keySet()){
            System.out.println(map.get(x));
        }
    }
}