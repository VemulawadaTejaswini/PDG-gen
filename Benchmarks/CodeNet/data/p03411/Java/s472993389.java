import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ayR = new int[n];
        int[] axB = new int[n];
        
        Map<Integer, Integer> xyR = new HashMap<Integer, Integer>();
        Map<Integer, Integer> xyB = new HashMap<Integer, Integer>();
        
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ayR[i] = sc.nextInt();
            xyR.put(ayR[i], x);
        }
        for (int i = 0; i < n; i++) {
            axB[i] = sc.nextInt();
            xyB.put(axB[i], sc.nextInt());
        }
        Arrays.sort(axB);
        Arrays.sort(ayR);
        int count = 0;
        boolean[] r = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            int xB = axB[i];
            int yB = xyB.get(xB);
            
            for (int j = n-1; j >= 0; j--) {
                int yR = ayR[j];
                int xR = xyR.get(yR);
                if (!r[j] && xR < xB && yR < yB) {
                    r[j] = true;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
