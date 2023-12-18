import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        Map<String,Integer> map1 = new HashMap();
        for (int i=0;i<N;i++){
            String s = sc.next();
            if (!map1.containsKey(s)){
                map1.put(s,1);
            }else{
                int j =map1.get(s);
                j++;
                map1.put(s,j);
            }
        }
        int M = sc.nextInt();
        Map<String,Integer> map2 = new HashMap();
        for (int i=0;i<M;i++){
            String s = sc.next();
            if (!map2.containsKey(s)){
                map2.put(s,1);
            }else{
                int j =map2.get(s);
                j++;
                map2.put(s,j);
            }
        }
        int ans =0;
        Iterator it = map1.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry =(Map.Entry)it.next();
            int count =(Integer)entry.getValue();
            if(map2.containsKey(entry.getKey())){
                count = count - map2.get(entry.getKey());
            }
            if (count >ans){
                ans =count;
            }
        }
        System.out.println(ans);


    }
}