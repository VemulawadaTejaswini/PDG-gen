import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmxy = br.readLine().split(" ");
        int n = Integer.parseInt(nmxy[0]);
        int m = Integer.parseInt(nmxy[1]);
        int x = Integer.parseInt(nmxy[2]);
        int y = Integer.parseInt(nmxy[3]);
        
        String[] str_xs = br.readLine().split(" ");
        String[] str_ys = br.readLine().split(" ");
        
        int[] xs = new int[n];
        int[] ys = new int[m];
        
        int max_x = -200;
        int min_y = 200;
        
        for (int i = 0; i < n; i++) {
            xs[i] = Integer.parseInt(str_xs[i]);
            if (xs[i] > max_x) {
                max_x = xs[i];
            }
        }
        
        for (int i = 0; i < m; i++) {
            ys[i] = Integer.parseInt(str_ys[i]);
            if (ys[i] < min_y) {
                min_y = ys[i];
            }
        }
        
        boolean flag = false;
        if (min_y > max_x) {
            for (int i = max_x+1; i <= min_y ;i++) {
                if (x < i && i <= y) {
                    flag = true;
                }
            }
        }
        
        if (flag) {
            System.out.println("No War");
        }
        else {
            System.out.println("War");
        }
        
        
        
        
    }
}
