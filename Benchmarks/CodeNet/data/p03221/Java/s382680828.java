import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Set<Element>> map = new HashMap<>(); // map: 県 -> Set of 市
        Map<Integer, Element> answerMap = new HashMap<>(); // 回答出力用のMap
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            Element element = new Element(p, y, i);
            if (!map.keySet().contains(p)) {
                map.put(p, new TreeSet<>());
            }
            map.get(p).add(element);
            answerMap.put(i, element);
        }
        sc.close();

        // 県ごとのカウンターをインクリメントしながら、認識番号を割り振り
        for (Integer p : map.keySet()) {
            int counter = 1;
            for (Element e : map.get(p)) {
                e.id = String.format("%06d%06d", e.p, counter);
                counter++;
            }
        }

        // 識別番号を出力
        for (int i = 0; i < m; i++) {
            System.out.println(answerMap.get(i).id);
        }
    }

    static class Element implements Comparable<Element> {
        int p;
        int y;
        int no;
        String id;

        Element(int p, int y, int no) {
            this.p = p;
            this.y = y;
            this.no = no;
        }

        @Override
        public String toString() {
            return "(p=" + p + ", y=" + y + ", no=" + no + ", id=" + id + ")";
        }

        @Override
        public int compareTo(Element o) {
            return y - o.y;
        }
    }

}
