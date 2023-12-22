import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    void move(int h, int w){
        int x = 0, y = 0;
        char[][] tile = new char[h][w];
        boolean[][] visited = new boolean[h][w];
        for(int i = 0; i < h; i++){
            tile[i] = in.nextLine().toCharArray();
        }
        while(tile[y][x] != '.' && !visited[y][x]){
            visited[y][x] = true;
            switch(tile[y][x]){
                case '>': x++; break;
                case '<': x--; break;
                case '^': y--; break;
                case 'v': y++; break;
            }
        }
        if(visited[y][x]){
            System.out.println("LOOP");
        }else{
            System.out.println(x + " " + y);
        }
    }

    void solve(){
        int h = in.nextInt(), w = in.nextInt(); in.nextLine();
        while(h + w > 0){
            move(h, w);
            h = in.nextInt(); w = in.nextInt(); in.nextLine();
        }
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }

    int getInt(){
        return Integer.parseInt(in.nextLine());
    }
}