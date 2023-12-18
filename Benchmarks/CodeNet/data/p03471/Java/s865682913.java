import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ny = br.readLine().split(" ");
        int n = Integer.parseInt(ny[0]);
        int y = Integer.parseInt(ny[1]);
        int a10000 = -1;
        int a5000 = -1;
        int a1000 = -1;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (10000*i + 5000*j + 1000*(n-i-j) == y && n-i-j >= 0) {
                    a10000 = i;
                    a5000 = j;
                    a1000 = n-i-j;
                    break;
                }
            }
        }
        
        
        System.out.println(a10000 + " " + a5000 + " " + a1000);
    }
}



