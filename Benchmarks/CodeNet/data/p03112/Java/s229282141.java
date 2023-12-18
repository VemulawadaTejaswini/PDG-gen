
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Q = sc.nextInt();

        long[] s = new long[A];
        long[] t = new long[B];
        long[] X = new long[Q];

        for(int i = 0; i < A; i++){  s[i] = sc.nextLong(); }
        for(int i = 0; i < B; i++){  t[i] = sc.nextLong(); }
        for(int i = 0; i < Q; i++){  X[i] = sc.nextLong(); }


        for(int i = 0; i < Q; i++) {
            long min = Long.MAX_VALUE;
            long x = X[i];

            // 8パターンの内、最小のものを調べる
            // <- 神社, -> 寺
            min = Math.min(search(x, s, "left", t, "right"), min);

            // <- 神社, <- 寺
            min = Math.min(search(x, s, "left", t, "left"), min);

            // -> 神社, -> 寺
            min = Math.min(search(x, s, "right", t, "right"), min);

            // -> 神社, <- 寺
            min = Math.min(search(x, s, "right", t, "left"), min);

            // <- 寺, -> 神社
            min = Math.min(search(x, t, "left", s, "right"), min);

            // <- 寺, <- 神社
            min = Math.min(search(x, t, "left", s, "left"), min);

            // -> 寺, -> 神社
            min = Math.min(search(x, t, "right", s, "right"), min);

            // -> 寺, <- 神社
            min = Math.min(search(x, t, "right", s, "left"), min);

            out.println(min);
        }
    }

    public static long search(long start_point, long[] first_search_array, String first_direction, long[] second_search_array, String second_direction) {
        long cost = Long.MAX_VALUE;
        int first_iter_add = 0;
        int second_iter_add = 0;

        if(first_direction.equals("left")){ first_iter_add = -1; }
        if(second_direction.equals("left")){ second_iter_add = -1; }

        //out.println(start_point + "," + Arrays.toString(first_search_array) + "," + first_direction + "," + Arrays.toString(second_search_array) + "," + second_direction);

        int first_iter = binarySearch(first_search_array, start_point) + first_iter_add;
        //out.println("=>" + first_iter + "," + first_iter_add);
        if (first_iter >= 0 && first_iter < first_search_array.length) {
            long first = first_search_array[first_iter];
            //out.println("==>" + first);
            int second_iter = binarySearch(second_search_array, first) + second_iter_add;
            //out.println("===>" + second_iter);
            if (second_iter >= 0 && second_iter < second_search_array.length) {
                long second = second_search_array[second_iter];
                //out.println("====>" + second);
                cost = Math.abs(first - start_point) + Math.abs(second - first);
            }
        }
        return cost;
    }


    // https://qiita.com/taskie/items/b4e45e2005aa38e90bcb
    public static int binarySearch(long[] array, long num){
        int result = Arrays.binarySearch(array, num);
        return (result >= 0) ? result : ~result;
    }
}
