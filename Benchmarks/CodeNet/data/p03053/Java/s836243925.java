import java.util.*;

class Main{
    static int[][] table;
    static int H,W,num_black;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        num_black = 0;
        sc.nextLine();
        table = new int[H][W];
        for(int i=0;i<H;i++){
            String[] tmp = sc.nextLine().split("");
            for(int j=0;j<tmp.length;j++){
                if(tmp[j].equals("#")){
                    table[i][j] = 0;
                    num_black++;
                }
                else{
                    table[i][j] = 1000000;
                }
            }
        }

        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(table[i][j]==0){
                    fill_table(i, j+1, 1);
                    fill_table(i+1, j, 1);
                    fill_table(i, j-1, 1);
                    fill_table(i-1, j, 1);
                }
            }
        }

        dump();
    }

    public static void dump() {
        int result = 0;
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(result<table[i][j])result=table[i][j];
                //System.out.print(table[i][j]);
            }
            //System.out.println();
        }
        System.out.println(result);
    }

    public static void fill_table(int x, int y, int count) {
        if(x<0 || y<0 || x>H-1 || y>W-1)return;
        if(table[x][y]<=count)return;
        table[x][y] = count;
        fill_table(x+1, y, count+1);
        fill_table(x, y+1, count+1);
        fill_table(x-1, y, count+1);
        fill_table(x, y-1, count+1);
    }

}