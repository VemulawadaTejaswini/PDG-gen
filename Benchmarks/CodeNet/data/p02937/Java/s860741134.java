
import java.util.*;

public class Main {

    public class BinarySearch {

        public BinarySearch() {

        }

        public int lowerBound(List<Integer> array, int value) {
            int left = -1;
            int right = array.size();
            while (right - left > 1) {
                int middle = (right + left) / 2;
                if (array.get(middle) >= value) {
                    right = middle;
                } else {
                    left = middle;
                }
            }
            return right;
        }

        public int upperBound(List<Integer> array, int value) {
            int left = -1;
            int right = array.size();
            while (right - left > 1) {
                int middle = (right + left) / 2;
                if (array.get(middle) > value) {
                    right = middle;
                } else {
                    left = middle;
                }
            }
            return right;
        }

    }


    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        List<Integer>[] sArr = new List[26];

        for (int i = 0; i < 26; i++) {
            sArr[i] = new ArrayList<>();
        }

        for (int i = 0; i < s.length(); i++) {
            sArr[s.charAt(i) - 'a'].add(i);
        }

        long ans = 0;
        int currentIdx = -1;
        BinarySearch bs = new BinarySearch();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (sArr[c - 'a'].isEmpty()) {
                break;
            }
//            debug(currentIdx);
            int idx = bs.upperBound(sArr[c - 'a'], currentIdx);
//            debug(c, idx);
            if (idx >= sArr[c - 'a'].size()) {
                currentIdx = sArr[c - 'a'].get(0);
                ans += s.length();
            } else {
                currentIdx = sArr[c - 'a'].get(idx);
            }

        }


        System.out.println(currentIdx != -1 ? ans + currentIdx + 1 : -1);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
