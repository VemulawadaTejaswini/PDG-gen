import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int[] a = populateList(n);
        int[] b = populateList(n);

        Map<String, Integer> m = new HashMap<>();
        per(m, "", n, new boolean[n]);

        System.out.println(Math.abs(m.get(join(a)) - m.get(join(b))));

    }

    static int[] populateList(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    static String join(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
        }
        return sb.toString();
    }

    static void per(Map<String, Integer> m, String ans, int n, boolean[] mask){
        if (ans.length() == n) {
            m.put(ans, m.size());
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!mask[i]) {
                mask[i] = true;
                per(m, ans + (i+1), n, mask);
                mask[i] = false;
            }
        }
    }
}