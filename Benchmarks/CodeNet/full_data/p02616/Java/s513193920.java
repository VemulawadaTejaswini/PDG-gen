
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add((long)sc.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());

        int num = 0;
        int pi = 0;
        int mi = N-1;
        List<Long> ansList = new ArrayList<>();

        if(list.get(0) < 0 && K % 2 == 1) {
            for(int i = 0; i < K; i++) {
                ansList.add(list.get(i));
            }
            num = K;
        }
        while(num < K) {
            if(K-num == 1) {
                ansList.add(list.get(pi));
                break;
            }
            if(list.get(pi) * list.get(pi+1) < list.get(mi) * list.get(mi-1)) {
                ansList.add(list.get(mi));
                ansList.add(list.get(mi-1));
                mi -= 2;
            } else {
                ansList.add(list.get(pi));
                ansList.add(list.get(pi+1));
                pi += 2;
            }
            num += 2;
        }
        int MOD = 1000000007;
        long ans = 1;

        for(Long l : ansList) {
            ans = ans * l % MOD;
        }

        if(ans < 0)
        os.println(ans + MOD);
        else
            os.println(ans);

    }


}