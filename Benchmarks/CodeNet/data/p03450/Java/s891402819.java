import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class InputData {
    public long R;
    public long L;
    public long D;
    public boolean done;
}

public class Main {
    public static void dump(HashMap<Long, Long> in) {
        for (Long k : in.keySet()) {
            System.out.println(k + " => " + in.get(k));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<InputData> input = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            InputData tmp = new InputData();
            tmp.R = sc.nextInt();
            tmp.L = sc.nextInt();
            tmp.D = sc.nextInt();
            tmp.done = false;
            input.add(tmp);
        }

        HashMap<Long, Long> defined = new HashMap();

        boolean up_first = true;
        boolean first = true;
        int done_num = 0;
        while(done_num != input.size()) {
            if (up_first) first = true;
            boolean add = false;
            for (InputData d : input) {
                if (d.done == true) continue;
                if (first && d.done == false) {
                    //System.out.println(d.R + "," + d.L);
                    defined.put(d.R, Long.valueOf(0));
                    defined.put(d.L, d.D);
                    d.done = true;
                    first = false;
                    add = true;
                    done_num++;
                    continue;
                }
                if (defined.containsKey(d.R) && defined.containsKey(d.L)) {
                    // 矛盾
                    if (defined.get(d.L) - defined.get(d.R) != d.D) {
                        System.out.println("No");
                        return;
                    }
                    continue;
                }
                if (defined.containsKey(d.R)) {
                    defined.put(d.L, defined.get(d.R) + d.D);
                    d.done = true;
                    done_num++;
                    add = true;
                }
                if (defined.containsKey(d.L)) {
                    defined.put(d.R, defined.get(d.L) - d.D);
                    d.done = true;
                    done_num++;
                    add = true;
                }
            }
            // 何もaddできなかった場合は距離が分かっている集合が別に存在してしまっている
            if (!add) up_first = true;
            //dump(defined);
        }
        System.out.println("Yes");
    }
}