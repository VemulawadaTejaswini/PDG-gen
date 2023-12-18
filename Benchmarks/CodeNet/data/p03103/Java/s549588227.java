import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + B[i]);
            }
            else{
                map.put(A[i], B[i]);
                list.add(A[i]);
            }
        }

        Collections.sort(list);

        long ans = 0L;
        for(int i=0; i<list.size(); i++){
            int x = list.get(i);
            if(map.get(x)<=M){
                ans += 1L * x * map.get(x);
                M -= map.get(x);
            }
            else{
                ans += 1L * x * M;
                M=0;
            }
            if(M==0){
                break;
            }
        }
        System.out.println(ans);
    }
}