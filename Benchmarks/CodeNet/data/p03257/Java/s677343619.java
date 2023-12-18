import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                sc.close();
                if(n == 2){
                        ou.print("4 7\n23 10\n");
                }else{
                        long[] sos = new long[2 * n];
                        long[] sosos = new long[2 * n];
                        long[][] map = new long[n][n];
                        for(int i = 0 ; i < n ; i++){
                                Arrays.fill(map[i] , 1);
                        }
                        sos[0] = 2;
                        int q = 1;
                        for(long i = 3 ; q < 2 * n ; i++){
                                boolean ebishu = true;
                                for(int j = 2 ; j <= Math.sqrt(i) && ebishu ; j++){
                                        if(i % j == 0) ebishu = false;
                                }
                                if(ebishu){
                                        sos[q] = i;
                                        q++;
                                }
                        }
                        int aaa = 0;
                        int bbb = 2 * n - 1;
                        for(int i = 0 ; i < n * 2 ; i++){
                                if(i % 2 == 0){
                                        sosos[i] = sos[aaa];
                                        aaa++;
                                }else{
                                        sosos[i] = sos[bbb];
                                        bbb--;
                                }
                        }
                        for(int i = 0 ; i < n ; i++){
                                for(int j = 0 ; j < n ; j++){
                                        map[i][j] *= sosos[i];
                                }
                        }
                        for(int j = 0 ; j < n ; j++){
                                for(int i = 0 ; i < n ; i++){
                                        map[i][j] *= sosos[j + n];
                                }
                        }
                        for(int i = 0 ; i < n ; i++){
                                for(int j = 0 ; j < n ; j++){
                                        if((i + j) % 2 != 0){
                                                if(j == n - 1 && i == 0){
                                                        map[0][n - 1] = map[1][n - 1] * map[0][n - 2] + 1;
                                                }else if(i == n - 1 && j == 0){
                                                        map[i][j] = map[n - 2][0] * map[n - 1][1] + 1;
                                                }else if(i == 0){
                                                        map[0][j] = map[0][j - 1] * map[0][j + 1] / map[0][j] * map[1][j] + 1;
                                                }else if(i == n - 1){
                                                        map[n - 1][j] = map[n - 1][j + 1] * map[n - 1][j - 1] / map[n - 1][j] * map[n - 2][j] + 1;
                                                }else if(j == 0){
                                                        map[i][0] = map[i - 1][0] * map[i + 1][0] / map[i][0] * map[i][1] + 1;
                                                }else if(j == n - 1){
                                                        map[i][n - 1] =  map[i - 1][n - 1] * map[i + 1][n - 1] / map[i][n - 1] * map[i][n - 2] + 1;
                                                }else{
                                                        map[i][j] = map[i + 1][j] * map[i][j + 1] / map[i][j] * map[i - 1][j] * map[i][j - 1] / map[i][j] + 1;
                                                }
                                        }
                                        ou.print(map[i][j]);
                                        if(j == n - 1) ou.print("\n");
                                        else ou.print(" ");
                                }
                        }
                }
                ou.flush();
        }
}