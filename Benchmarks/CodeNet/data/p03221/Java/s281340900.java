import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] P = new int[M];
        int[] Y = new int[M];
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();

        for(int i=0; i<M; i++){
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            if(map.containsKey(P[i])){
                LinkedList<Integer> list = map.get(P[i]);
                list.add(Y[i]);
                map.put(P[i], list);
            }
            else{
                LinkedList<Integer> list = new LinkedList<>();
                list.add(Y[i]);
                map.put(P[i], list);
            }
        }

        for(int key : map.keySet()){
            LinkedList<Integer> list = map.get(key);
            Collections.sort(list);
            map.put(key, list);
        }

        for(int i=0; i<M; i++){
            LinkedList<Integer> list = map.get(P[i]);
            int n = list.indexOf(Y[i]) + 1;
            int lp = String.valueOf(P[i]).length();
            int ln = String.valueOf(n).length();
            String S = "";
            for(int j=0; j<6-lp; j++){
                S += "0";
            }
            S += P[i];
            for(int j=0; j<6-ln; j++){
                S += "0";
            }
            S += n;
            System.out.println(S);
        }
    }
}