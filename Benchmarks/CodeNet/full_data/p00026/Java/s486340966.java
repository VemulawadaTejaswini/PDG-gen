import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[][][] ink = new int[3][][];
                ink[0] = new int[][]{{0,1,0},{1,1,1},{0,1,0}};
                ink[1] = new int[3][3];
                for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                                ink[1][i][j] = 1;
                        }
                }
                ink[2] = new int[5][5];
                int[][] tmp = ink[2];
                for(int i = 1; i < 4;i++){
                        for(int j = 1; j < 4; j++){
                                tmp[i][j] = 1;
                        }
                }
                tmp[0][2] = 1;
                tmp[2][0] = 1;
                tmp[2][4] = 1;
                tmp[4][2] = 1;
                int[][] paper = new int[14][14];
                while(sc.hasNext()){
                        String[] s = sc.nextLine().split(",");
                        int x = Integer.parseInt(s[0])+2;
                        int y = Integer.parseInt(s[1])+2;
                        int size = Integer.parseInt(s[2])-1;
                        drop(paper, x, y, ink[size]);
                }
                sc.close();
                int white = 0;
                int max = 0;
                for(int i = 2; i < 12; i++){
                        for(int j = 2; j < 12; j++){
                                if(paper[i][j] == 0){
                                        white++;
                                }else{
                                        max = Math.max(paper[i][j], max);
                                }
                        }
                }
                System.out.println(white+"\n"+max);
        }
        static void drop(int[][] paper, int x, int y, int[][] ink){
                x -= ink.length/2;
                y -= ink.length/2;
                for(int i = 0; i < ink.length; i++){
                        for(int j = 0; j < ink.length; j++){
                                paper[i+x][j+y] += ink[i][j];
                        }
                }
        }
}