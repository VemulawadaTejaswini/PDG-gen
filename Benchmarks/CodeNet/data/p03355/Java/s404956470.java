import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String str = f.readLine();
        int k = Integer.parseInt(f.readLine());
        Set<String> set = new TreeSet<>();
        for (int j = 0; j < str.length(); j++) {
            for (int p = j; p < str.length(); p++) {
                String a = "";
                if (p == str.length() - 1) {
                    a = str.substring(j);
                } else {
                    a = str.substring(j, p + 1);
                }
                set.add(a);
            }
        }
        int ind = 0;
        for (String i : set) {
            if (ind == k - 1) {
                out.println(i);
                break;
            }
            ind++;
        }
        out.close();

    }

}
