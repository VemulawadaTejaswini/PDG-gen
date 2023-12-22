
import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String args[]){
        char direction;
        int N, M, robo_x = 10, robo_y = 10, distance, count;
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
            for(int i = 0; i < M; i++) {
                line = sc.next();
                distance = sc.nextInt();
                direction = line.charAt(0);
                while (distance > 0) {
                    switch (direction) {
                        case 'N':
                            robo_y++;
                            break;
                        case 'E':
                            robo_x++;
                            break;
                        case 'S':
                            robo_y--;
                            break;
                        case 'W':
                            robo_x--;
                            break;
                        default:
                            System.exit(0);
                    }
                    for (int j = 0; j < N; j++) {
                        if (robo_x == x[j] && robo_y == y[j]) {
                            count++;
                            x[j] = -1;
                            y[j] = -1;
                        }
                    }
                    distance--;
                }
            }
            if(count == N) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}