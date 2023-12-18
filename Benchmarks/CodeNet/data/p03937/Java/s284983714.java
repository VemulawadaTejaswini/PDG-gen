import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
        }
        if(map[0][0] == '.'){
            System.out.println("Impossible");
            return;
        }else{
            map[0][0] = '.';
        }
        int y = 0;
        int x = 0;
        while(true){
            if(y == h-1 && x == w-1){
                break;
            }else if(y == h-1){
                if(map[y][x+1] == '#'){
                    map[y][x+1] = '.';
                    x++;
                }else{
                    System.out.println("Impossible");
                    return;
                }
            }else if(x == w-1){
                if(map[y+1][x] == '#'){
                    map[y+1][x] = '.';
                    y++;
                }else{
                    System.out.println("Impossible");
                    return;
                }
            }else{
                if(map[y+1][x] == '#' && map[y][x+1] == '#' || map[y+1][x] == '.' && map[y][x+1] == '.'){
                    System.out.println("Impossible");
                    return;
                }else if(map[y+1][x] == '#'){
                    map[y+1][x] = '.';
                    y++;
                }else if(map[y][x+1] == '#'){
                    map[y][x+1] = '.';
                    x++;
                }else{
                    System.out.println("Impossible");
                    return;
                }
            }
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(map[i][j] == '#'){
                    System.out.println("Impossible");
                    return;
                }
            }
        }
        System.out.println("Possible");
    }
}
