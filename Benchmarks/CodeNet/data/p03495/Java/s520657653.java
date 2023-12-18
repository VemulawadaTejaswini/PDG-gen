import java.util.*;
import java.util.TreeMap;
import java.util.Map;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            }
            else{
                map.put(A[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int key: map.keySet()){
            list.add(map.get(key));
        }

        Collections.sort(list);
        if(list.size()<=K){
            System.out.println(0);
            return;
        }
        int ans = 0;
        for(int i=0; i<list.size()-K; i++){
            ans += list.get(i);
        }
        System.out.println(ans);
    }
}