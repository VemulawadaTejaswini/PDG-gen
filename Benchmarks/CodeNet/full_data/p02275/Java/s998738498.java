import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;             
    static final int MAXN = 11111;
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] c = new int[MAXN];
        for (int i = 0; i < n; ++i) {
            int x = input.nextInt(); 
            ++c[x];
        }
        for (int i = 0; i < MAXN; ++i) {
            if (c[i] > 0) {
                for (int k = 0; k < c[i]; ++k) {
                    --n;
                    if (n > 0) System.out.print(i + " ");
                    else System.out.println(i);
                }
            }
        }
    }              
}