import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if(map.containsKey(a)){
                map.put(a,map.get(a)+b);
            }else{
                map.put(a,b);
            }
        }
        int idx = 0; 
        for(int key:map.keySet()){
            idx += map.get(key);
            if(idx>=k){
                System.out.println(key);
                return;
            }
        }
        return;
    }
}