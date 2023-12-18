import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Integer>> s = new ArrayList<>(M);
        for(int i = 0; i < M; i++) {
            int k = sc.nextInt();
            s.add(new ArrayList<>(k));
            for(int j = 0; j < k; j++) {
                int a = sc.nextInt();
                a--;
                s.get(i).add(a);
            }
        }
        List<Integer> p = new ArrayList<>();
        for(int i = 0; i < M; i++) {
            p.add(sc.nextInt());
        }

        long res = 0;
        for(int bit = 0; bit < (1 << N); bit++) {
            boolean ok = true;
            for(int i = 0; i < M; i++) {
                int count = 0;
                for(int t : s.get(i)) {
                    if(((bit >> t) & 1) == 1) count++;
                }
                if(count % 2 != p.get(i)) ok = false;
            }
            if(ok) res++;
        }
        System.out.println(res);
    }
}
