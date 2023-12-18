import java.util.*;

public class Main {
    public void main(Scanner sc) {
        char a[] = sc.next().toCharArray();
        sc.close();
        int len = a.length;

        Map<Character, TreeSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.putIfAbsent(a[i], new TreeSet<>());
            map.get(a[i]).add(i + 1);
        }

        int data[] = new int[len + 1];
        BitSet bset = new BitSet();
        data[len] = 0;
        for (int i = len - 1; i >= 0; i--) {
            bset.set(a[i] - 'a');
            data[i] = data[i + 1];
            if (bset.cardinality() == 26) {
                bset.clear();
                data[i]++;
            }
        }

        int cntup[] = new int[data[0] + 2];
        for (int i = 0; i < len; i++) {
            if (data[i] != data[i + 1]) {
                cntup[data[0] - data[i + 1]] = i + 1;
            }
        }
        cntup[data[0] + 1] = len + 1;

        char ans[] = new char[data[0] + 1];
        for (char c = 'a'; c <= 'z'; c++) {
            if (!bset.get(c - 'a')) {
                ans[0] = c;
                break;
            }
        }

        int p = cntup[1];
        for (int i = 1; i < ans.length; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                if (map.get(c).floor(cntup[i + 1]) <= map.get(ans[i - 1]).ceiling(p)) {
                    ans[i] = c;
                    p = cntup[i + 1];
                    break;
                }
            }
        }
        System.out.println(new String(ans));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
