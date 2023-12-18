import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[m][13];
        
        for (int i = 0; i < m; i++) {
            array[i][0] = sc.nextInt();
            
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                array[i][sc.nextInt()] = 1;
            }
        }
        Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));
        
        long cost = 0;
        boolean[] ok = new boolean[13];
        for (int i = 1; i <= 12; i++) {
            if (ok[i]) continue;
            
            for (int j = 0; j < m; j++) {
                if (array[j][i] == 1) {
                    cost += array[j][0];
                    for (int l = 1; l <= 12; l++) {
                        if (array[j][l] == 1) {
                            ok[l] = true;
                        }
                    }
                    break;
                }
            }
        }
        
        System.out.println(cost);
    }
}
