import java.util.*;
import java.util.stream.*;
import java.util.function.*;

// 構造化してcomparingthenでソートすればいいのだが
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 県数
        int m = sc.nextInt();// 市数計
        // int[] p = new int[m];// 県番号
        // int[] y = new int[m];// 年
        // Map<Integer, List<Integer>> py = new HashMap<>();
        List<Py> pyList = new ArrayList<>(m);
        for(int i = 0; i < m; i++) {
            pyList.add(new Py(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
            // pyList.add(new Py(sc.nextInt(), sc.nextInt()));
        }
        Map<Integer, List<Py>> pyMap = pyList.stream().collect(Collectors.groupingBy(py -> py.p));
        pyMap.values().stream().forEach(pyl -> pyl.sort(Comparator.comparing(py -> py.y)));
        for(Py py: pyList) {
            int index = pyMap.get(py.p).indexOf(py);
            System.out.printf("%06d%06d%n", py.p, index + 1);
        }
    }
}

class Py {
    int p;
    int y;
    public Py(int p, int y) {
        this.p = p;
        this.y = y;
    }
    public boolean equals(Object o) {
        if(o instanceof Py) {
            Py oo = (Py)o;
            return p == oo.p && y == oo.y;
        }
        return false;
    }
}

