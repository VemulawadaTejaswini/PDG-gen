import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char board[][] = new char[H][W];
        List<Data> list = new ArrayList<>();
        for(int i = 0; i < H; i++){
            String s = sc.next();
            for(int j = 0; j < s.length(); j++){
                board[i][j] = s.charAt(j);
                if(board[i][j] == '#'){
                    list.add(new Data(i, j));
                }
            }
        }
        
        int index = 0;
        int result = 0;
        while(true){
            int size = list.size();
            if(size == H * W){
                break;
            }
            for(int i = index; i < size; i++){
                Data d = list.get(i);
                if(d.x > 0){
                    if(board[d.x - 1][d.y] == '.'){
                        list.add(new Data(d.x - 1, d.y));
                        board[d.x - 1][d.y] = '#';
                    }
                }
                if(d.y > 0){
                    if(board[d.x][d.y - 1] == '.'){
                        list.add(new Data(d.x, d.y - 1));
                        board[d.x][d.y - 1] = '#';
                    }
                }
                if(d.x < H - 1){
                    if(board[d.x + 1][d.y] == '.'){
                        list.add(new Data(d.x + 1, d.y));
                        board[d.x + 1][d.y] = '#';
                    }
                }
                if(d.y < W - 1){
                    if(board[d.x][d.y + 1] == '.'){
                        list.add(new Data(d.x, d.y + 1));
                        board[d.x][d.y + 1] = '#';
                    }
                }
                index++;
            }
            result++;
        }
        
        System.out.println(result);
        
    }
    
    public static class Data{
        public int x;
        public int y;
        Data(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
