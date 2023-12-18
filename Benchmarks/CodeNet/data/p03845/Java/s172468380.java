import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                int sum = 0;
                int[] t = new int[n];
                for(int i = 0 ; i < n ; i++){
                        t[i] = Integer.parseInt(sc.next());
                        sum += t[i];
                }
                int m = Integer.parseInt(sc.next());
                int[][] p = new int[2][m];
                for(int i = 0 ; i < m ; i++){
                        for(int j = 0 ; j < 2 ; j++){
                                p[j][i] = Integer.parseInt(sc.next());
                        }
                        ou.print(sum - t[p[0][i] - 1] + p[1][i] + "\n");
                }
                sc.close();
                ou.flush();
        }
}