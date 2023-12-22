
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer M = Integer.parseInt(scanner.next());
        Map<Integer, Integer> H = new HashMap<Integer, Integer>();


        for (int i = 0; i < N; i++) {
            H.put(i, Integer.parseInt(scanner.next()));
        }

        boolean[] I = new boolean[N];
        boolean[] C = new boolean[N];
        Arrays.fill(I, true);
        for (int i = 0; i < M; i++) {
            Integer A1 = Integer.parseInt(scanner.next())-1;
            Integer A2 = Integer.parseInt(scanner.next())-1;
            if(H.get(A1) > H.get(A2)) I[A2] = false;
            if(H.get(A2) > H.get(A1)) I[A1] = false;
            if(H.get(A2) == H.get(A1)) {
                I[A1] = false;
                I[A2] = false;
            }
        }

        Integer count = 0;
        for (boolean i : I) if (i) count += 1;
        System.out.println(count);
    }
}
