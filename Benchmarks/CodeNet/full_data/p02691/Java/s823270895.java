import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        long[] A = new long[N];
        long ans = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        for(int i=0; i<N; i++){
            long L = A[i] + i + 1;
            if(map.containsKey(L)){
                map.put(L, map.get(L) + 1);
            }
            else{
                map.put(L, 1);
            }
        }
        for(int i=0; i<N; i++){
            long R = i + 1 - A[i];
            if(map.containsKey(R)){
                ans += map.get(R);        
            }
        }
        System.out.println(ans);
    }
}