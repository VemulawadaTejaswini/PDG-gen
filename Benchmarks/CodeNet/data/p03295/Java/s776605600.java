import java.util.*;
import java.util.TreeMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i=0; i<M; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            map.put(b[i], a[i]);
        }
        boolean[] bridge = new boolean[N];
        int x = 0;
        int ans = 0;
        for(int key : map.keySet()){
            if(map.get(key)>x){
                x = key - 1;
                ans += 1;
            }
        }   
        System.out.println(ans);     
    }
}