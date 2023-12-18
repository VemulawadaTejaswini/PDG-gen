import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String command  = input.readLine();
        Point [] val = new Point[n];

        val[0] = new Point(0, 0, 0, 0 , command.charAt(0));

        for (int i = 1; i < n; i++) {
            int prevEast = val[i - 1].eastleft + (val[i - 1].me == 'E' ? 1 : 0);
            int prevWest = val[i - 1].westleft + (val[i - 1].me == 'W' ? 1 : 0);

            val[i] = new Point(prevEast, prevWest, 0, 0, command.charAt(i));
        }

        for (int i = n - 2 ; i >  -1 ; i--) {
            int prevEast = val[i + 1].eastRight + (val[i + 1].me == 'E' ? 1 : 0);
            int prevWest = val[i + 1].westRight + (val[i + 1].me == 'W' ? 1 : 0);

            val[i].eastRight = prevEast;
            val[i].westRight = prevWest;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int leftWest = val[i].westleft;
            int wright = val[i].eastRight;
            min = Math.min(leftWest+ wright , min);
        }
        System.out.println(min);

    }
}


class Point {

    int eastleft;
    int westleft;
    int eastRight;

    public Point(int eastleft, int westleft, int eastRight, int westRight, char me) {
        this.eastleft = eastleft;
        this.westleft = westleft;
        this.eastRight = eastRight;
        this.westRight = westRight;
        this.me = me;
    }

    int westRight;

    char me;


}