import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        char[][] map = new char[h][w];
        for(int i = 0; i < h; i++){
            String s = scan.next();
            for(int j = 0; j < w; j++){
                map[i][j] = s.charAt(j);
            }
        }
        char[][] out = new char[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(map[i][j] == '#'){
                    out[i][j] = '#';
                    continue;
                }
                int c = 0;
                for(int k = -1; k <= 1; k++){
                    for(int l = -1; l <= 1; l++){
                        int yp = i + k;
                        int xp = j + l;
                        if(0 <= yp && yp < h && 0 <= xp && xp < w && map[yp][xp] == '#'){
                            c++;
                        }
                    }
                }
                out[i][j] = Integer.toString(c).charAt(0);
            }
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(out[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}