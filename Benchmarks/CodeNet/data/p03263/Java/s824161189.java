import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                int h = Integer.parseInt(sc.next());
                int w = Integer.parseInt(sc.next());
                int[][] a = new int[h][w];
                for(int i = 0 ; i < h ; i++){
                        for(int j = 0 ; j < w ; j++){
                                a[i][j] = Integer.parseInt(sc.next());
                        }
                }
                sc.close();
                int[][] q = new int[4][w * h];
                int yono = 0;
                for(int i = 0 ; i < w ; i++){
                        for(int j = 0 ; j < h - 1 ; j++){
                                if(a[j][i] % 2 != 0){
                                        q[0][yono] = j + 1;
                                        q[1][yono] = i + 1;
                                        q[2][yono] = j + 2;
                                        q[3][yono] = i + 1;
                                        yono++;
                                        a[j + 1][i]++;
                                }
                        }
                }
                for(int i = 0 ; i < w - 1 ; i++){
                        if(a[h - 1][i] % 2 != 0){
                                q[0][yono] = h;
                                q[1][yono] = i + 1;
                                q[2][yono] = h;
                                q[3][yono] = i + 2;
                                yono++;
                                a[h - 1][i + 1]++;
                        }
                }
                System.out.println(yono);
                for(int i = 0 ; i < yono ; i++){
                        ou.println(q[0][i] + " " + q[1][i] + " " + q[2][i] + " " + q[3][i]);
                }
                ou.flush();
        }
}