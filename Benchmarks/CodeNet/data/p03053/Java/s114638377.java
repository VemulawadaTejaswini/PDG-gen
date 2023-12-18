import java.util.*;

class Main{
    static int[][] table;
    static int H,W,num_black;
    static int count = 0;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        num_black = 0;
        sc.nextLine();
        table = new int[H+2][W+2];
        List<List<Integer>> black_list = new ArrayList<>();
        for(int i=0;i<H;i++){
            String[] tmp = sc.nextLine().split("");
            for(int j=0;j<tmp.length;j++){
                if(tmp[j].equals("#")){
                    List<Integer> tmp2 = new ArrayList<>();
                    tmp2.add(i+1);
                    tmp2.add(j+1);
                    table[i+1][j+1] = 0;
                    num_black++;
                    black_list.add(tmp2);
                }
                else{
                    table[i+1][j+1] = 1000000;
                }

            }
        }

        // for(int i=0;i<H;i++){
        //     for(int j=0;j<W;j++){
        //         if(table[i][j]==0){
        //             fill_black(black_list);
        //             fill_table(i, j+1, 1);
        //             fill_table(i+1, j, 1);
        //             fill_table(i, j-1, 1);
        //             fill_table(i-1, j, 1);
        //         }
        //     }
        // }
        fill_black(black_list);

        dump();
    }

    public static void fill_black(List<List<Integer>> b_list) {
        if(H*W==num_black)return;
        List<List<Integer>> new_list = new ArrayList<>();
        count++;
        for(List<Integer> lis : b_list){
            int h=lis.get(0);
            int w=lis.get(1);
            if(table[h+1][w]>count){
                List<Integer> tmp = new ArrayList<>();
                table[h+1][w]=count;
                tmp.add(h+1);
                tmp.add(w);
                num_black++;
                new_list.add(tmp);
            }
            if(table[h][w+1]>count){
                List<Integer> tmp = new ArrayList<>();
                table[h][w+1]=count;
                tmp.add(h);
                tmp.add(w+1);
                num_black++;
                new_list.add(tmp);
            }
            if(table[h-1][w]>count){
                List<Integer> tmp = new ArrayList<>();
                table[h-1][w]=count;
                tmp.add(h-1);
                tmp.add(w);
                num_black++;
                new_list.add(tmp);
            }
            if(table[h][w-1]>count){
                List<Integer> tmp = new ArrayList<>();
                table[h][w-1]=count;
                tmp.add(h);
                tmp.add(w-1);
                num_black++;
                new_list.add(tmp);
            }
        }
        fill_black(new_list);
    }

    public static void dump() {
        int result = 0;
        for(int i=0;i<H+2;i++){
            for(int j=0;j<W+2;j++){
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