import java.util.*;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        int[] C = new int[M];
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            lista.add(A[i]);
        }
        Collections.sort(lista);
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        for(int i=0; i<M; i++){
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
            if(map.containsKey(C[i])){
                map.put(C[i], map.get(C[i]) + B[i]);
            }
            else{
                map.put(C[i], B[i]);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        loop:for(int key: map.keySet()){
            for(int j=0; j<map.get(key); j++){
                list.add(key);
                if(list.size()==N){
                    break loop;
                }
            }
        }
        long ans = 0;
        for(int i=0; i<N; i++){
            if(list.size()>i){
                if(lista.get(i)<list.get(i)){
                    A[i] = list.get(i);
                }
                else{
                    A[i] = lista.get(i);
                }
            }
            else{
                A[i] = lista.get(i);
            }
            ans += A[i];
        }
        System.out.println(ans);
    }
}