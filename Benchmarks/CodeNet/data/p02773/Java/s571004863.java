import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static long MOD = 1_000_000_007;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int inp_num = Integer.parseInt(sc.next());
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < inp_num; i++) {
            String s = sc.next();
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        int ma = -1;
        ArrayList<String> candidates = new ArrayList<>();
        for (Entry<String, Integer> ent : m.entrySet()) {
            if(ma == ent.getValue() && !candidates.contains(ent.getKey())){
                candidates.add(ent.getKey());
            }else if(ma < ent.getValue()){
                candidates.clear();
                ma = ent.getValue();
                candidates.add(ent.getKey());
            }
      }
      candidates.sort(null);
      for(String can : candidates){
        System.out.println(can);
      }
  }
}