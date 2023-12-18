package tasks;

import personalUtil.FasterScanner;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TaskB {
    public void solve(int testNumber, FasterScanner in, PrintWriter out) {
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(in.nextInt());
        }

        a.sort(Comparator.reverseOrder());

        int com = Integer.MAX_VALUE;

        int ans = 0;
        for(int i = 0; i < a.size(); i++){
            int cn = a.get(i);
            while(cn < (com >> 1)){
                com = com >> 1;
            }
            int target = 1 + (com ^ cn);
            // System.out.println(cn + " " + target + " " + com);
            if(a.contains(target)){
                ans++;
                a.remove(Integer.valueOf(target));
            }
        }

        out.println(ans);
    }
}
