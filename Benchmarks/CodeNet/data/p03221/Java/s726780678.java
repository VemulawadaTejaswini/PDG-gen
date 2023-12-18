import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] pArray = new int[m];
        long[] yArray = new long[m];
        
        Map<Integer, List<Long>> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            int p = sc.nextInt();
            long y = sc.nextLong();
            pArray[i] = p;
            yArray[i] = y;
            if(map.containsKey(p)){
                map.get(p).add(y);
            }else{
                List<Long> list = new ArrayList<>();
                list.add(y);
                map.put(p, list);
            }
        }
        
        for(Map.Entry<Integer, List<Long>> entry : map.entrySet()){
            Collections.sort(entry.getValue());
        }
        
        for(int i = 0; i < m; i++){
            System.out.println(String.format("%06d", pArray[i]) + String.format("%06d", map.get(pArray[i]).indexOf(yArray[i]) + 1L));
        }
    }
}
