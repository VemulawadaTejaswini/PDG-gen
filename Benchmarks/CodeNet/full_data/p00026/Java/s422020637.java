import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[][] field = new int[10][10];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[] p = {-2, 0, 2, 0};
    static int[] q = {0, 2, 0, -2};
    static int x, y, size;
    public static void main(String[] args) {
        while(read()){
            write();
        }
        solve();
    }
    static boolean read(){
        if(!sc.hasNext())
            return false;
        String[] input = sc.next().split(",");
        x = Integer.parseInt(input[0]);
        y = Integer.parseInt(input[1]);
        size = Integer.parseInt(input[2]);
        return true;
    }
    static void write(){
        if(size == 1){
            drop_small(x, y);
        }else if(size == 2){
            drop_medium(x, y);
        }else if(size == 3){
            drop_large(x, y);
        }
    }

    static void drop_small(int x, int y){
        field[y][x]++;
        for(int i = 0; i < dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if( nx >= 0 && nx <= 9 &&  ny >= 0 && ny <= 9 )field[ny][nx]++;
        }
    }

    static void drop_medium(int x, int y){
        for(int i = -1; i <=1; i++){
            for(int j = -1; j <= 1; j++){
                int nx = x + i;
                int ny = y + j;
                if( nx >= 0 && nx <= 9 &&  ny >= 0 && ny <= 9 )field[ny][nx]++;
            }
        }
    }

    static void drop_large(int x, int y){
        drop_medium(x, y);
        for(int i = 0; i < p.length; i++){
            int nx = x + p[i];
            int ny = y + q[i];
            if( nx >= 0 && nx <= 9 &&  ny >= 0 && ny <= 9 )field[ny][nx]++;
        }
    }
    static void solve(){
        int res = 0;
        int max = 0;
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[0].length; j++){
                if(field[i][j] == 0)res++;
                if(field[i][j] > max)max = field[i][j];
            }
        }
        System.out.println(res);
        System.out.println(max);
        /*for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[0].length; j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }*/
    }
}