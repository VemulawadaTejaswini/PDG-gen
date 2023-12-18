import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next()); //N軒の店があり
        int M = Integer.parseInt(sc.next()); //M本の栄養ドリンクを買いたい
       
        long[] A = new long[N]; //iの店　1本Ai円の栄養ドリンクを
        int[] B = new int[N]; //Bi本買える
        //key：値段　value：本数
        Map<Long, Integer> map = new HashMap<>();
        
        for(int i=0; i<N; i++) {
            A[i] = Long.parseLong(sc.next());
            B[i] = Integer.parseInt(sc.next());
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+B[i]);
            }else {
                map.put(A[i], B[i]);
            }
        }
        //昇順(安い順)に並べ替え
        Object[] key = map.keySet().toArray();
        Arrays.sort(key);
        
        int bin = M; //必要な本数
        long sum = 0;
        for(long k : map.keySet()) {

            if(bin > map.get(k)) {
                sum += k * map.get(k);
                bin -= map.get(k);
            }else {
                sum += k * bin;
                bin = 0;
            }
            if(bin <= 0) {
                break;
            }
        }
        System.out.println(sum);
        
    }
}