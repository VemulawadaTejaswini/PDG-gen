import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[][] ab = new int[n - 1][2];
        int[][] px = new int[q][2];
        int[] nValue = new int[n];
        Arrays.fill(nValue, 0);
        Map<Integer, List<Integer>> parents = new TreeMap<Integer, List<Integer>>();

        for (int i = 0; i < n - 1; i++) {
            ab[i][0] = scanner.nextInt();
            ab[i][1] = scanner.nextInt();
            if(!parents.containsKey(ab[i][1]-1)) {
                parents.put(ab[i][1]-1, new ArrayList<Integer>());
            }
            parents.get(ab[i][1]-1).add(ab[i][0]-1);
        }
        for (int i = 0; i < q; i++) {
            px[i][0] = scanner.nextInt();
            px[i][1] = scanner.nextInt();
            nValue[px[i][0] - 1] += px[i][1];
        }

        for (int i = 0; i < n; i++) {
            if(parents.containsKey(i)){
                for(int j : parents.get(i))
                    nValue[i] += nValue[j];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nValue[i] + " ");
        }
    }

}
