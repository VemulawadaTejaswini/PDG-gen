import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n==0&&m==0) {
                break;
            }
            String s = sc.next();
            String p = sc.next();
            String g = sc.next();
            
            int[][] path = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(path[i], 10000000);
            }
            
            String[] names = new String[n];
            Map<String, Integer> revmap = new HashMap<String, Integer>(n * 4 / 3 + 1);
            int numNames = 0;
            
            for (int i = 0; i < m; i++) {
                String a = sc.next();
                String b = sc.next();
                Integer ai = revmap.get(a);
                Integer bi = revmap.get(b);
                if (ai == null) {
                    ai = numNames;
                    names[numNames++] = a;
                    revmap.put(a, ai);
                }
                if (bi == null) {
                    bi = numNames;
                    names[numNames++] = b;
                    revmap.put(b, bi);
                }
                path[ai][bi] = path[bi][ai] = sc.nextInt() / 40 + sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (i!=j && j != k) {
                            path[i][k] = path[k][i] = Math.min(path[i][k], path[i][j] + path[j][k]);
                        }
                    }
                }
            }
            
            int pIndex = revmap.get(p);
            System.out.println(path[revmap.get(s)][pIndex] + path[pIndex][revmap.get(g)]);
        }
    }

}