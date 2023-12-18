import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < N; i++){
            a[i] = sc.nextInt();
            if(map.containsKey(a[i]))
                map.put(a[i], map.get(a[i])+1);
            else
                map.put(a[i], 1);
        }
        sc.close();

        int count = 0;

        for(Integer key: map.keySet()){
            if(key > map.get(key))
                count += map.get(key);
            else
                count += map.get(key) - key;
        }

        System.out.println(count);
    }
}