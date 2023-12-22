import java.util.Scanner;
public class Main {
    static int max_depth=1;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true) {
            max_depth=1;
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m==0 && n==0) break;
            int[][] table = new int[m + 2][n + 2];
            for (int i = 0; i < m + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    table[i][j] = 0;
                }
            }
            for (int i = 1; i < m + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    table[i][j] = sc.nextInt();
                }
            }
            for (int i = 1; i < m + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if (table[i][j] == 1) hakuhyo(table, i, j, 1);
                }
            }
            System.out.println(max_depth);
        }
    }
    public static void hakuhyo(int[][] table,int x,int y,int depth){
        if(table[x-1][y]==0 && table[x][y-1]==0 && table[x][y+1]==0 && table[x+1][y]==0) {
            if (depth > max_depth) max_depth = depth;
            return;
        }
        table[x][y]=0;
        if(table[x-1][y]==1){
            hakuhyo(table,x-1,y,depth+1);
        }
        if(table[x][y-1]==1){
            hakuhyo(table,x,y-1,depth+1);
        }
        if(table[x][y+1]==1){
            hakuhyo(table,x,y+1,depth+1);
        }
        if(table[x+1][y]==1){
            hakuhyo(table,x+1,y,depth+1);
        }
        table[x][y]=1; //割った氷を元に戻す
    }
}

