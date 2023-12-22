
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int h = sc.nextInt();
            if(h==0)break;
            int[][] f = new int[h][5];
            for (int i = 0; i < f.length; i++) {
                for (int j = 0; j < 5; j++) {
                    f[f.length-1-i][j]=sc.nextInt();   
                      
                }
            }
            System.out.println(calc(f));
        }
    }
    static int calc(int[][] f){
        int res = 0;
        while(true){
            boolean[][] checked = new boolean[f.length][5];
            int point = 0;
            for (int i = 0; i < f.length; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int j2 = 1; j2 <= 9; j2++) {
                        boolean flg =true;
                        for (int k = 0; k < 3; k++) {
                            if(f[i][j+k]!=j2){
                                flg=false;
                            }
                        }
                        if(flg){
                            for (int k = 0; k < 3; k++) {
                                checked[i][j+k]=true;
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < checked.length; i++) {
                for (int j = 0; j < 5; j++) {
                    if(checked[i][j]){
                        point+=f[i][j];
                        f[i][j]=0;
                    }
                }
            }
            
            if(point==0)break;
            res+=point;
            fall(f);
        }
        return res;
    }
    static void fall(int[][] f){
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < 5; j++) {
                while(f[i][j]==0 && above(f,i,j)){
                    for (int j2 = i; j2 < f.length-1; j2++) {
                        f[j2][j] = f[j2+1][j];
                    }
                }
            }
        }
    }
    static boolean above(int[][]f,int y,int x){
        for (int i = y+1; i < f.length; i++) {
            if(f[i][x]>0)return true;
        }
        return false;
    }
   
}