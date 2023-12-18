import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int[] S = new int[N+1];
        int[] T = new int[N+1];
        int sum = 0;
        S[0] = 0;
        T[0] = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        Integer tmp;
        while (i<N) {
            A[i] = Integer.parseInt(sc.next());
            S[i+1] = S[i] + A[i];
            T[i+1] = (S[i+1] - i-1)%K;
            if(i<K){
                if((tmp=map.get(T[i]))!=null){
                    map.put(T[i],tmp+1);
                }else{
                    map.put(T[i],0);
                }
            }
            i++;
        }
        sum+= map.get(T[0]);
      
        for(i=1;i<N;i++){
            tmp = map.get(T[i-1]);
            map.put(T[i-1],tmp-1);
            if(i+K-1<=N){
                if((tmp=map.get(T[i+K-1]))!=null){
                    map.put(T[i+K-1],tmp+1);
                }else{
                    map.put(T[i+K-1],0);
                }
            }
            sum+=map.get(T[i]);
        }
        System.out.println(sum);
      System.out.flush();
    }
}