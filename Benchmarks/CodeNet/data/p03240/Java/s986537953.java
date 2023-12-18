import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][3];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
            array[i][2] = sc.nextInt();
        }
        

        int idx = 0;
        while (array[idx][2] < 1) {
            idx++;
        }
        int tmpx = array[idx][0];
        int tmpy = array[idx][1];
        int tmph = array[idx][2];
        
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int high = Math.abs(cx-tmpx) + Math.abs(cy-tmpy) + tmph;
                
                boolean ok = true;
                for (int k = 1; k < n; k++) {
                    int x = array[k][0];
                    int y = array[k][1];
                    int h = array[k][2];
                    
                    int tmp = Math.max(high - Math.abs(x-cx) - Math.abs(y-cy), 0);
                    if (h != tmp) {
                        ok = false;
                        break;
                    }
                }
                
                if (ok) {
                    System.out.println(cx + " " + cy + " " + high);
                    return;
                }
            }
        }
    }
}