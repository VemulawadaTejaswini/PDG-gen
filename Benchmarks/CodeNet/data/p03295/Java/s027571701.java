import java.util.*;
import java.util.TreeMap;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        for(int i=0; i<M; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if(map.get(b[i])==null){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(a[i]);
                map.put(b[i], list);
            }
            else{
                ArrayList<Integer> list = map.get(b[i]);
                list.add(a[i]);
                map.put(b[i], list);
            }
        }
        boolean[] bridge = new boolean[N];
        int x = 0;
        int ans = 0;
        for(int key : map.keySet()){
            ArrayList<Integer> list = map.get(key);
            for(int i=0; i<list.size(); i++){
                if(list.get(i)>x && !bridge[key-1]){
                    x = key - 1;
                    ans += 1;
                    bridge[x] = true;
                }
            }
        }   
        System.out.println(ans);     
    }
}