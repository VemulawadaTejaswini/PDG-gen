import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ips = br.readLine().split(" ");
        int n = Integer.parseInt(ips[0]);
        int m = Integer.parseInt(ips[1]);
        int k = Integer.parseInt(ips[2]);
        for(int i = 0; i <= n; ++i){
            int num = (k-m*i);
            int den = (n-2*i);
            if(den==0)
                continue;
            if(num%den == 0 && num/den <= m && num/den >= 0){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}