//import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String[] str_as = br.readLine().split(" ");
        int[] as = new int[str_as.length];
        int min = 100005;
        int min_index = -1;
        
        for (int i = 0; i < as.length; i++) {
            as[i] = Integer.parseInt(str_as[i]);
            if (min > as[i]) {
                min = as[i];
                min_index = i;
            }
        }
        
        
        
        System.out.println((int)Math.ceil((n-1.0)/(k-1.0)));
    }
}
