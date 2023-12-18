import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for(int i = 0; i < h; i++){
            String s = sc.next();
            for(int j = 0; j < w; j++){
                map[i][j] = s.charAt(j);
            }
        }
        sc.close();
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(map[i][j] == '#'){
                    if(!check(map, h, w, i, j)){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        
        System.out.println("Yes");
    }

    int[] x = {0, 1, 0, -1};
    int[] y = {-1, 0, 1, 0};
    public boolean check(char[][] map, int h, int w, int nowx, int nowy){
        for(int i = 0; i < 4; i++){
            if(nowx + x[i] >= h || nowx + x[i] < 0){
                continue;
            }
            if(nowy + y[i] >= w || nowy + y[i] < 0){
                continue;
            }
            if(map[nowx + x[i]][nowy + y[i]] == '#'){
                return true;
            }
        }

        return false;
    }
    
}