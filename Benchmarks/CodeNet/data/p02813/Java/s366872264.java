import java.util.*;

public class Main {
    static List<List<Integer>> ll = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        populateList(a, n);
        populateList(b, n);

        LinkedList<Integer> arr = new LinkedList<>();
        per(arr, n, new boolean[n]);
        int ans1 = getN(ll, a);
        int ans2 = getN(ll, b);
        System.out.println(Math.abs(ans1-ans2));

    }

    static int getN(List<List<Integer>> sorted, List<Integer> arr) {
        int idx = 0;
        for (List<Integer> perms : sorted) {
            idx++;
            boolean flag = true;
            for (int i = 0; i < perms.size(); i++) {
                if (!perms.get(i).equals(arr.get(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return idx;
        }
        return -1;
    }

    static void populateList(List<Integer> arr, int n) {
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
    }

    static void per(LinkedList<Integer> arr, int n, boolean[] mask){
        if (arr.size() == n) {
            ll.add(new LinkedList<>(arr));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!mask[i]) {
                arr.add(i+1);
                mask[i] = true;
                per(arr, n, mask);
                arr.removeLast();
                mask[i] = false;
            }
        }
    }
}