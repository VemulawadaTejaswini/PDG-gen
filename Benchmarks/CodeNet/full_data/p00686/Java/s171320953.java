import java.util.Scanner;
public class Main{
    int NORTH = 0;
    int EAST = 1;
    int SOUTH = 2;
    int WEST = 3;
    int[] dx = { 0, 1, 0, -1};
    int[] dy = { 1, 0, -1, 0};

    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w == 0 && h == 0){
                break;
            }
            int[][] field = new int[h][w];
            int direction = NORTH;
            int x = 0;
            int y = 0;
            while(true){
                String command = sc.next();
                if(command.equals("STOP")){
                        break;
                    }
                if(command.equals("FORWARD")){
                    int n = sc.nextInt();
                    for(int i = 0;i < n;i++){
                        int nx = x + dx[direction];
                        int ny = y + dy[direction];
                        if(nx < 0 || nx >= w || ny < 0 || ny >= h){
                            break;
                        }
                        x = nx;
                        y = ny;
                    }
                }
                if(command.equals("BACKWARD")){
                    int n = sc.nextInt();
                    for(int i = 0;i < n;i++){
                        int nx = x - dx[direction];
                        int ny = y - dy[direction];
                        if(nx < 0 || nx >= w || ny < 0 || ny >= h){
                            break;
                        }
                        x = nx;
                        y = ny;
                    }
                }
                if(command.equals("RIGHT")){
                    direction = (direction + 1) % 4;
                    }
                if(command.equals("LEFT")){
                    direction = (direction + 3) % 4;
                }

            }
            x += 1;
            y += 1;
            System.out.println(x + " " + y);
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}