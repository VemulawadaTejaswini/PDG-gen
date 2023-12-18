import java.util.*;

public class Main {
    public static String s[][];
    public static int ans[][];
    public static int ue = 0;
    public static int shita = 0;
    public static int migi = 0;
    public static int hidari = 0;
    
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int h = stdIn.nextInt(); //縦のマス
        int w = stdIn.nextInt(); //横のマス
        int k = stdIn.nextInt(); //イチゴのあるマス
        String s[][] = new String[h][w];
        int ans[][]  = new int[h][w];
        int index = 1;
        
        for(int i = 0; i < h; i++){
            String ss = stdIn.next();
            String array[] = ss.split("");
            for(int j = 0; j < w; j++){
                s[i][j] = array[j];
                if(s[i][j].equals("#")){
                    ans[i][j] = index;
                    index++;
                }else{
                    ans[i][j] = 0;
                }
            }
        }
        
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(ans[i][j] != 0){
                    kaiki(ans, h, w, i, j);
                }
            }
        }
        
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(j != w - 1){
                    System.out.print(ans[i][j] + " ");
                }else{
                    System.out.print(ans[i][j]);
                }
                
            }
            System.out.println();
        }
        
    }
    
    public static void kaiki(int ans[][], int h, int w, int i, int j){
        //0上 1右 2下 3左
        ue = kaiki2(ans, h, w, i, j, 0, 0);
        migi = kaiki2(ans, h, w, i, j, 1, 0);
        shita = kaiki2(ans, h, w, i, j, 2, 0);
        hidari = kaiki2(ans, h, w, i, j, 3, 0);
        
        
    }
    
    public static int kaiki2(int ans[][], int h, int w, int i, int j, int vec, int index){
        if(vec == 0){
            if(i - 1 >= 0){
                if(ans[i - 1][j] == 0){
                    kaiki2(ans, h, w, i - 1, j, 0, index + 1);
                }else{
                    return index;
                }
            }else{
                return index;
            }
        }else if(vec == 1){
            if(j + 1 < w){
                if(ans[i][j + 1] == 0){
                    kaiki2(ans, h, w, i, j + 1, 1, index + 1);
                }else{
                    return index;
                }
            }else{
                return index;
            }
        }else if(vec == 2){
            if(i + 1 < h){
                if(ans[i + 1][j] == 0){
                    kaiki2(ans, h, w, i + 1, j, 2, index + 1);
                }else{
                    return index;
                }
            }else{
                return index;
            }
        }else if(vec == 3){
            if(j - 1 >= 0){
                if(ans[i][j - 1] == 0){
                    kaiki2(ans, h, w, i, j - 1, 3, index + 1);
                }else{
                    return index;
                }
            }else{
                return index;
            }
        }
        
        return index;
    }
    
    public static void kaiki3(int ans[][], int h, int w, int i, int j){
        
    }
}
