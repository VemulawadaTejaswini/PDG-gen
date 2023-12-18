import java.util.*;
import javax.lang.model.util.ElementScanner6;

class Music {
    String title;
    long time;

    Music(String s, long t) {
        title = s;
        time = t;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();

        List<Music> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            long t = sc.nextLong();

            list.add(new Music(s, t));
        }

        String x = sc.next();

        // 処理
        long out = 0;
        boolean slp = false;
        for (int i = 0; i < n; i++) {
            if (slp == true) {
                out += list.get(i).time;
            }
            if (x.equals(list.get(i).title)) {
                slp = true;
            }
        }

        // 出力
        System.out.println(out);
    }
}