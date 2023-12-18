import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        // System.out.println(k);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if ((i + j) < str.length()) {
                    String a = "";
                    if (i + j == str.length() - 1) {
                        a = str.substring(i);
                    } else {
                        a = str.substring(i, i + j + 1);
                    }
                    set.add(a);
                    if (a.length() == k) {
                        break;
                    }
                }
            }
        }
        List<String> sorted = new ArrayList<>();
        sorted.addAll(set);
        Collections.sort(sorted);
        // System.out.println(sorted);
        out.println(sorted.get(k - 1));
        out.close();

    }

}
