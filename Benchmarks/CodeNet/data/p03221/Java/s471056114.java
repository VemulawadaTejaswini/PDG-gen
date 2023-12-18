



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] P = new int[m];
        int[] Y = new int[m];

        for(int i = 0; i < m; i++) {
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            --P[i];
        }
        List<List<Integer>> vals = new ArrayList<>(n);
        for(int i = 0; i < m; i++) {
            vals.add(new ArrayList());
        }
        for(int i = 0; i < m; i++) {
            vals.get(P[i]).add(Y[i]);
        }

        for(int v = 0; v < n; v++) {
            Collections.sort(vals.get(v));
        }

        for(int i = 0; i < m; i++) {
            int v = P[i];
            System.out.print(String.format("%06d", v + 1));

            
            int id = Collections.binarySearch(vals.get(v), Y[i]);
            System.out.print(String.format("%06d\n", id + 1));
        }
    }
}
