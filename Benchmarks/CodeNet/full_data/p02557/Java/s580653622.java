import java.util.*;

public class Main {

    static class Node {
        int x, num;
        Node (int x, int num) {
            this.x = x;
            this.num = num;
        }
    }

    private static List<Node> sortArray(int[] a) {
        int n = a.length;
        Map<Integer, Integer> M = new HashMap();
        for (int i = 0; i < n; i++) {
            M.put(a[i], M.getOrDefault(a[i], 0) + 1);
        }
        List<Node> list = new ArrayList();
        for (Integer key : M.keySet()) {
            list.add(new Node(key, M.get(key)));
        }
        Collections.sort(list, (e1, e2) -> (e2.num - e1.num));
        return list;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scan.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = scan.nextInt();
        List<Node> la = sortArray(a);
        Map<Integer, Integer> M = new HashMap();
        for (int i = 0; i < n; i++) {
            M.put(b[i], M.getOrDefault(b[i], 0) + 1);
        }
        boolean flag = true;
//        for (int i = 0; i < la.size(); i++) {
//            int x = la.get(i).x;
//            int num = la.get(i).num;
//            int numb = n - M.getOrDefault(x, 0);
//            if (numb < num) {
//                flag = false;
//                break;
//            }
//        }
        int[] ans = new int[n];
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            tm.put(b[i], tm.getOrDefault(b[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int key = a[i];
            Integer nextKey = tm.ceilingKey(key + 1);
            if (nextKey != null) {
                ans[i] = nextKey;
                tm.put(nextKey, tm.get(nextKey) - 1);
                if (tm.get(nextKey) == 0) tm.remove(nextKey);
                continue;
            }
            Integer preKey = tm.floorKey(key - 1);
            if (preKey != null) {
                ans[i] = preKey;
                tm.put(preKey, tm.get(preKey) - 1);
                if (tm.get(preKey) == 0) tm.remove(preKey);
                continue;
            }
            flag = false;
            break;
        }
        if (flag == false) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + (i == n - 1 ? "\n" : " "));
            }
        }
    }
}
