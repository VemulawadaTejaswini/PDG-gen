import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int dp[][];
    static int w;
    static int h;
    static int max = 0;
    static ArrayList<Integer> mhs;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
         h = sc.nextInt();
         w = sc.nextInt();
        int[][] board = new int[w][h];
        dp = new int[w][h];
        for (int y = 0;y < h;++y){
            for (int x = 0;x < w;++x){
                board[x][y] = sc.nextInt();
                dp[x][y] = Integer.MIN_VALUE;
            }
        }
        //search(0,0,board,0,new ArrayList<>());

        mhs = search(board);
        System.out.println(mhs.size() / 2);
        for (int i = 0;i < mhs.size() / 2;++i){
            int n1 = mhs.get(i * 2);
            int n2 = mhs.get(i * 2 + 1);
            int y1 = n1 / w;
            int x1 = (n1 - y1 * w);
            int y2 = n2 / w;
            int x2 = (n2 - y2 * w);
            StringBuilder sb = new StringBuilder();
            sb.append(y1 + 1);
            sb.append(' ');
            sb.append(x1 + 1);
            sb.append(' ');
            sb.append(y2 + 1);
            sb.append(' ');
            sb.append(x2 + 1);
            System.out.println(sb.toString());
        }

      /*  int c = 0;
        for (int y = 0;y < h;++y){
            for (int x = 0;x < w;++x){
                if((board[x][y] & 1) == 0){
                    ++c;
                }
            }
        }
        System.out.println(c);*/
    }

    public static ArrayList<Integer> search(int board[][]){
        ArrayList<Integer> hi = new ArrayList<>();
        for (int y = 1;y < h;++y){
            for (int x = 0;x < w;++x){
                if((board[x][y - 1] & 1) == 1){
                    --board[x][y - 1];
                    ++board[x][y];
                    hi.add(x + (y - 1) * w);
                    hi.add(x + y * w);
                }
            }
        }
        for (int x = 0;x < w - 1;++x){
            if((board[x][h - 1] & 1) == 1){
                --board[x][h - 1];
                ++board[x + 1][h - 1];
                hi.add(x + (h - 1) * w);
                hi.add(x + 1 + (h - 1) * w);
            }
        }
        return hi;
    }


}


