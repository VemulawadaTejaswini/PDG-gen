import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            if(map.containsKey(A[i]))
                map.put(A[i], map.get(A[i])+1);
            else
                map.put(A[i], 1);
        }
        sc.close();
        
        int ans = map.size();
        int cnt = 0;
        for(Integer key: map.keySet()){
            cnt += map.get(key)-1;
        }

        if(cnt % 2 == 0)
            System.out.println(ans);
        else
            System.out.println(ans-1);
    }
}