

import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String args[]){
        char direction;
        int N, M, robot_x, robot_y, distance, count;
        int x[] = new int[20];
        int y[] = new int[20];
        String line;
        Scanner sc = new Scanner(System.in);
        while(true){
            N = sc.nextInt();
            if(N == 0) break;
            for(int i = 0; i < N; i++){
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
            M = sc.nextInt();
            count = 0;
            robot_x = 10;
            robot_y = 10;
            for(int i = 0; i < M; i++) {
                line = sc.next();
                direction = line.charAt(0);
                for(distance = sc.nextInt(); distance > 0; distance--) {
                    switch (direction) {
                        case 'N':
                            robot_y++;
                            break;
                        case 'E':
                            robot_x++;
                            break;
                        case 'S':
                            robot_y--;
                            break;
                        case 'W':
                            robot_x--;
                            break;
                        default:
                            System.exit(0);
                    }
                    for (int j = 0; j < N; j++) {
                        if (robot_x == x[j] && robot_y == y[j]) {
                            count++;
                            x[j] = -1;
                            y[j] = -1;
                        }
                    }
                }
            }
            if(count == N) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}