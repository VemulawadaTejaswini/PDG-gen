import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        solve2000();
    }

    static int robo_x;
    static int robo_y;
    static boolean[][] map;

    public static void solve2000() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int N = sc.nextInt();
            if(N == 0){
                break;
            }
            // ???????????????
            map = new boolean[21][21];
            for(int n = 0; n < N; n++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                // ??\???????????????????????????????????????
                map[y][x] = true;
            }

            // ????????????????????¨??????????????????
            robo_x = 10;
            robo_y = 10;

            int M = sc.nextInt();
            for(int m = 0; m < M; m++){
                String direction = sc.next();
                int stepCount = sc.nextInt();
                // ????????¨??§???????????\???
                move(direction, stepCount);
            }

            //map???true????????£????????????No
            boolean result = true;
            for(int i=0; i < map.length; i++){
                for(int j=0; j < map[i].length; j++){
                    if(map[i][j] == true){
                        result = false;
                        break;
                    }
                }
            }
            System.out.println(result ? "Yes" : "No");
        }
    }

    public static void move(String direction, int stepCount){
        for(int i = 0; i < stepCount; i++) {
            switch (direction) {
                case "N":
                    // ?????¨???????????´??°
                    robo_y++;
                    // map????§???????????????????false
                    map[robo_y][robo_x] = false;
                    break;
                case "E":
                    robo_x++;
                    map[robo_y][robo_x] = false;
                    break;
                case "S":
                    robo_y--;
                    map[robo_y][robo_x] = false;
                    break;
                case "W":
                    robo_x--;
                    map[robo_y][robo_x] = false;
                    break;
                default:
                    break;
            }
        }
    }
}