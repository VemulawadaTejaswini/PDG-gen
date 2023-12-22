

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        long sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i ++ ) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i ++ ) {
            sum += A[i];
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        int T = sc.nextInt();

        while (T > 0) {
            int B = sc.nextInt();
            int C = sc.nextInt();


            if (map.containsKey(B)) {
                int countB = map.get(B);
                sum -= countB * B;


                sum += countB * C;
                map.put(C, map.getOrDefault(C, 0) + countB);
                map.remove(B);
            }
            System.out.println(sum);


            T -- ;
        }

    }
}
