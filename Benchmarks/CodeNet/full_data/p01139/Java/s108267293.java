import java.util.Scanner;

/**
 * Created by Reopard on 2014/07/06.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static char[][] general;

    public static void main(String[] args){

        char[][] black_area, white_area;
        int w, h, black, white;
        while((w = sc.nextInt()) != 0 | (h = sc.nextInt()) != 0){
            general = new char[h][w];
            black_area = new char[h + 2][w + 2];
            white_area = new char[h + 2][w + 2];
            for(int i = 0; i < h; i++) general[i] = sc.next().toCharArray();
            initArea(black_area, 'B');
            initArea(white_area, 'W');
            black = findAreaStock(black_area, 'B', 'W');
            white = findAreaStock(white_area, 'W', 'B');
            System.out.println(black + " " + white);
        }
    }

    static void initArea(char[][] area, char side){
        for(int i = 0; i < area[0].length; i++) area[0][i] = side;
        for(int i = 1; i <= area.length - 2; i++){
            area[i][0] = side;
            for(int j = 0; j < general[i - 1].length; j++) area[i][j + 1] = general[i - 1][j];
            area[i][area[i].length - 1] = side;
        }
        for(int i = 0; i < area[area.length - 1].length; i++) area[area.length - 1][i] = side;
    }

    static int findAreaStock(char[][] area, char side, char ob){
        int temp = 0;
        char[][] check_area;
        for(int i = 1; i <= area.length - 2; i++){
            for(int j = 1; j <= area[i].length - 2; j++){
                if(area[i][j] == side){
                    for(int k = 0; k < 4; k++){
                        check_area = copyArea(area);
                        if(checkStock(check_area, side, ob, j + dx[k], i + dy[k])){
                            temp += calcArea(area, side, j + dx[k], i + dy[k]);
                        }
                    }
                }
            }
        }
        return temp;
    }

    static boolean checkStock(char[][] area, char side, char ob, int x, int y){
        boolean temp = true;
        if(area[y][x] == side || area[y][x] == '-') return true;
        else if(area[y][x] == ob)  return false;
        else if(area[y][x] == '.'){
            area[y][x] = '-';
            for(int i = 0; i < 4; i++) temp &= checkStock(area, side, ob, x + dx[i], y + dy[i]);
        }
        return temp;
    }

    static int calcArea(char[][] area, char side, int x, int y){
        int count = 0;
        if(area[y][x] == side){
            return 0;
        }else if(area[y][x] == '.'){
            area[y][x] = ' ';
            count++;
            for(int i = 0; i < 4; i++){
                count += calcArea(area, side, x + dx[i], y + dy[i]);
            }
        }
        return count;
    }

    static char[][] copyArea(char[][] copying){
        char[][] temp = new char[copying.length][copying[0].length];
        for(int i = 0; i < copying.length; i++){
            for(int j = 0; j < copying[i].length; j++){
                temp[i][j] = copying[i][j];
            }
        }
        return temp;

    }
}