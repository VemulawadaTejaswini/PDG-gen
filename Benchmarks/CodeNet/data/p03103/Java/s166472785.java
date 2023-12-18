import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next()); //N軒の店があり
        int M = Integer.parseInt(sc.next()); //M本の栄養ドリンクを買いたい

        long[] A = new long[N]; //iの店　1本Ai円の栄養ドリンクを
        int[] B = new int[N]; //Bi本買える
        //key：値段　value：本数
        Map<Long, Integer> map = new TreeMap<>();

        for(int i=0; i<N; i++) {
            A[i] = Long.parseLong(sc.next());
            B[i] = Integer.parseInt(sc.next());
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+B[i]);
            }else {
                map.put(A[i], B[i]);
            }
        }

        Long count = 0l;
        Long total = 0l;
        for (Long str : map.keySet()) {
            for (int i = 0; i < map.get(str); i++) {
                if(count >= M) break;
                total += str;
                count++;
            }
        }
        System.out.println(total);
    }
}
