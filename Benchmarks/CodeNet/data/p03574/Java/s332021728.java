import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        char[][]t = new char[H][W];
        String a = "#";
        char b = a.charAt(0);
        int[] dx = {1, 0, -1, 0, 1, -1, -1, 1};
        int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};

        for(int i=0; i<H; i++){
            S[i] = sc.next();
            for(int j=0; j<W; j++){
                t[i][j] = S[i].charAt(j);
            }
        }
        String[][] ans = new String[H][W];
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(t[i][j]!=b){
                    int sum = 0;
                    for(int k=0; k<8; k++){
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if(x<0 || x>=H){
                            continue;
                        }
                        if(y<0 || y>=W){
                            continue;
                        }
                        if(t[x][y]==b){
                            sum += 1;
                        }
                    }
                    ans[i][j] = String.valueOf(sum);
                }
                else{
                    ans[i][j] = a;
                }
            }
        }
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                System.out.print(ans[i][j]);
            }
            System.out.print("\n");
            
        }
    }
}