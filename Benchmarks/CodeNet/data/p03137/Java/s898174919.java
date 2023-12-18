import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    static int gcd(int x, int y) {
        int r = Math.max(x, y) % Math.min(x, y);
        if (r == 0) return Math.min(x, y);
        else return gcd(Math.min(x, y), r);
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] pos = new int[m];
        String[] s = br.readLine().split(" ");
        
        for (int i = 0; i < m; i++) {
            pos[i] = Integer.parseInt(s[i]);
        }
        
        Arrays.sort(pos);
        
        int[] diff = new int[m-1];
        for (int i = 0; i < m-1; i++) {
            diff[i] = pos[i+1] - pos[i];
        }
        
        Arrays.sort(diff);
        
        int sum = 0;
        for (int i = m-n-1; i >= 0; i--) {
            sum += diff[i];
        }
        
        System.out.println(sum);
    }
}



