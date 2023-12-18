import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean movable = true;
        int t[] = new int[N+1];
        int x[] = new int[N+1];
        int y[] = new int[N+1];
        int dt;
        int dist;
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        
        for (int i = 1; i <= N; i++) {

            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            dt = t[i] - t[i-1];
            dist = Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]);

            if (dt%2 != dist%2) {
                movable = false;
            }

            if(dt < dist) {
                movable = false;
            }
        }
        System.out.println(movable ? "Yes" : "No");
    }
}