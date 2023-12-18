import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int D = sc.nextInt();

        Map<Integer, Position> positions = new HashMap<>();
        for (int j =1; j<=W;j++){
            for (int i=1; i<=H; i++){
                positions.put(sc.nextInt(), new Position(i, j));
            }
        }

        int Q = sc.nextInt();
        for (int q=1; q<=Q;q++){
            int mp = 0;
            int L = sc.nextInt();
            int R = sc.nextInt();
            Position now;
            for (int x=L; x != R; x+=D){
                now = positions.get(x);
                mp += Math.abs(now.getI() - positions.get(x+D).getI()) + Math.abs(now.getJ() - positions.get(x+D).getJ());
            }
            System.out.println(mp);
        }
    }
}

class Position{
    private int i;
    private int j;
    public Position(int i, int j){
        this.i = i;
        this.j = j;
    }

    public int getI(){
        return i;
    }

    public int getJ() {
        return j;
    }
}