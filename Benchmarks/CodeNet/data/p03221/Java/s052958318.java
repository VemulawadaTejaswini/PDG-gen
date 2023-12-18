import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Element> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Element(p, y, i));
        }
        sc.close();

        // 誕生年の昇順でソート
        Collections.sort(list, (e1, e2) -> e1.y - e2.y);
//        System.out.println(list);

        // 県ごとのカウンター
        int[] counter = new int[n];
        // 県ごとのカウンターをインクリメントしながら、認識番号を割り振り
        for (Element e : list) {
            e.id = String.format("%06d%06d", e.p, counter[e.p - 1] + 1);
            counter[e.p - 1]++;
        }

        // 市の昇順でソート
        Collections.sort(list, (e1, e2) -> e1.no - e2.no);
//        System.out.println(list);

        // 識別番号のみ抽出し出力
        list.stream().map(e -> e.id).forEach(System.out::println);
    }

    static class Element {
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
    }

}
