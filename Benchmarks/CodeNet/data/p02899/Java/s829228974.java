import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer a[][] = new Integer[2][N];
        for (int i=0; i<N; i++) {
            a[0][i] = Integer.parseInt(sc.next());
            a[1][i] = i + 1;
        }
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i=0; i<N; i++)
            map.put(a[0][i], a[1][i]);
        int k = 0;
        for (int key : map.keySet()) {
            a[0][k] = key;
            a[1][k++] = map.get(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(a[1][i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}