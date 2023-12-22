import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) throws IOException {
         
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i = 0; i < n; ++i) s[i] = sc.nextInt();
        
        int q = sc.nextInt();
        int[] t = new int[q];
        for(int i = 0; i < q; ++i) t[i] = sc.nextInt();
         
        int cnt = 0;
        for(int p : t)
            if(Arrays.binarySearch(s, p) >= 0) ++cnt;
        
        System.out.println(cnt);
    }
}
