import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Set<Integer> P = new HashSet<>();
        Map<Integer, Integer> Q = new HashMap<>();
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        long cnt=0;
        for(int i=0;i<N;i++){
            int p = A[i]-i;
            int q = -(A[i]+i);
            if(Q.containsKey(p)){
                cnt += (long)Q.get(p);
            }
            Q.putIfAbsent(q, 0);
            Q.put(q, Q.get(q)+1);
        }
        System.out.println(cnt);
    }

}
