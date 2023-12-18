import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 県数
        int m = sc.nextInt();// 市数計
        // int[] p = new int[m];// 県番号
        // int[] y = new int[m];// 年
        int[][] py = new int[m][2];//0:元の順, 1:県, 2:年
        for(int i = 0; i < m; i++) {
            // py[i][0] = i;
            py[i][0] = Integer.parseInt(sc.next());
            py[i][1] = Integer.parseInt(sc.next());
            // p[i] = Integer.parseInt(sc.next());
            // y[i] = Integer.parseInt(sc.next());
        }
        
        // 年でソートして各県に割り振っていくのが一番無駄はない
        // int[] ps = Stream.of(py).mapToInt(e -> e[0]).distinct().toArray();
        Map<Integer, List<Integer>> pyMap = new HashMap<>();
        // for(int pp: ps) {
        //     pyMap.put(pp, new ArrayList<>());
        // }
        
        // int[] sortedp = Arrays.copyOf(p, p.length);
        // Arrays.sort();
        // Arrays.sort(py, Comparator.comparingInt(e -> e[1]).thenComparing(Comparator.comparingInt(e -> e[2])));
        // 年だけでいい
        int[][] sortedPy = Arrays.copyOf(py, py.length);
        Arrays.sort(sortedPy, Comparator.comparingInt(e -> e[1]));
        for(int i = 0; i < m; i++) {
            List<Integer> ys = pyMap.get(sortedPy[i][0]);
            if(ys == null) {
                ys = new ArrayList<>();
                pyMap.put(sortedPy[i][0], ys);
            }
            ys.add(sortedPy[i][1]);
        }
        
        // pyMap.values().forEach(l -> l.sort(null));

        for(int i = 0; i < m; i++) {
            int index = pyMap.get(py[i][0]).indexOf(py[i][1]);
            System.out.printf("%06d%06d%n", py[i][0], index + 1);
        }
        
    }
}
