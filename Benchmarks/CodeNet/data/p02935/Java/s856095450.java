import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main { // Template for CF
    public static class ListComparator implements Comparator<List<Integer>> {

        @Override
        public int compare(List<Integer> l1, List<Integer> l2) {
            for (int i = 0; i < l1.size(); ++i) {
                if (l1.get(i).compareTo(l2.get(i)) != 0) {
                    return l1.get(i).compareTo(l2.get(i));
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        // Check for int overflow!!!!
        // Should you use a long to store the sum or smthn?
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(f.readLine());
        List<Double> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int i = 0; i < N; i++) {
            double a = Integer.parseInt(st.nextToken());
            list.add(a);
        }
        Collections.sort(list);
        double ans = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            ans += list.get(i);
            ans /= 2;
        }
        out.println(ans);
        out.close();
    }

}