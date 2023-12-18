import java.util.*;
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[N];
        int[] B = new int[N];
        Map<Long, Integer> map = new TreeMap<Long, Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextLong();
            B[i] = sc.nextInt();
            map.put(A[i], B[i]);
        }
        
        long ans = 0;
        ArrayList<Long> list = new ArrayList<Long>(map.keySet());
        for(int i=0; i<N; i++){
            A[i] = list.get(i);
            B[i] = map.get(A[i]);
            if(B[i]<=M){
                ans += A[i] * B[i];
                M -= B[i];
            }
            else{
                ans += A[i] * M;
                break;
            }
        }
        System.out.println(ans);
    }
}