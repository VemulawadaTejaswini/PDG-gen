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
                        long[] sos = new long[(n * n + 1) / 2];
                        long[] sosos = new long[(n * n + 1) / 2];
                        long[][] map = new long[n][n];
                        sos[0] = 2;
                        sosos[0] = 2;
                        int q = 1;
                        for(long i = 3 ; q < (n * n + 1) / 2 ; i++){
                                boolean ebishu = true;
                                for(int j = 2 ; j <= Math.sqrt(i) && ebishu ; j++){
                                        if(i % j == 0) ebishu = false;
                                }
                                if(ebishu){
                                        sos[q] = i;
                                        q++;
                                }
                        }
                        int ebi = 1;
                        int shu = (n * n + 1) / 2 - 1;
                        for(int i = 1 ; i < (n * n + 1) / 2 ; i++){
                                if(i % 2 == 1){
                                        sosos[i] = sos[shu];
                                        shu--;
                                }else{
                                        sosos[i] = sos[ebi];
                                        ebi++;
                                }
                        }
                        int cou = 0;
                        for(int i = 0 ; i < n ; i++){
                                for(int j = 0 ; j < n ; j++){
                                        if((i + j) % 2 == 0){
                                                map[i][j] = sosos[cou];
                                                cou++;
                                        }
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
                                                        map[0][j] = map[0][j - 1] * map[0][j + 1] * map[1][j] + 1;
                                                }else if(i == n - 1){
                                                        map[n - 1][j] = map[n - 2][j] * map[n - 1][j + 1] * map[n - 1][j - 1] + 1;
                                                }else if(j == 0){
                                                        map[i][0] = map[i - 1][0] * map[i + 1][0] * map[i][1] + 1;
                                                }else if(j == n - 1){
                                                        map[i][n - 1] = map[i][n - 2] * map[i - 1][n - 1] * map[i + 1][n - 1] + 1;
                                                }else{
                                                        map[i][j] = map[i + 1][j] * map[i - 1][j] * map[i][j + 1] * map[i][j - 1] + 1;
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