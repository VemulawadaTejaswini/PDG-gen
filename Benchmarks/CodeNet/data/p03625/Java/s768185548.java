import java.util.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            }
            else{
                map.put(A[i], 1);
            }
            if(!list.contains(A[i])){
                list.add(A[i]);
            }
        }
        Collections.sort(list);
        
        int ans = 1;
        int x = 0;

        for(int i=list.size()-1; i>=0; i--){
            int a = list.get(i);
            if(map.get(a)>=4){
                ans *= a * a;
                break;
            }
            else if(map.get(a)>=2){
                ans *= a;
                x += 1;
                if(x==2){
                    break;
                }
            }
            if(i==0){
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}