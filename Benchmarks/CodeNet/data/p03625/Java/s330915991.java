import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            }
            else{
                map.put(A[i], 1);
                list.add(A[i]);
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        int[] x = new int[2];
        x[0] = 0;
        x[1] = 0;
        int k = 0;
        long ans = 0;
        for(int i : list){
            if(map.get(i)>=2){
                x[k] = i;
                k++;
            }
            if(map.get(i)>=4 && x[k]==0){
                x[k] = i;
            }
            if(x[1]!=0){
                break;
            }
        }
        System.out.println((long)x[0] * x[1]);
    }
}