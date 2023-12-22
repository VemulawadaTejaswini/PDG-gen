import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int xl = sc.nextInt();
        int xr = sc.nextInt();
        int pointSum = 0;
        Mogura[] moguras = new Mogura[n];
        for (int i = 0; i < n; i++) {
            moguras[i] = new Mogura(sc.nextInt(), sc.nextInt(), sc.nextInt());
            pointSum += moguras[i].p;
        }
        Arrays.sort(moguras);
        int[] remPoints = new int[n];
        remPoints[0] = pointSum;
        for (int i = 1; i < moguras.length; i++) {
            remPoints[i] = remPoints[i-1] - moguras[i-1].p;
        }
        //System.out.println(Arrays.toString(moguras));
        
        Queue<State> states = new ArrayDeque<State>(n*n);
        states.add(new State(xl, xr, 0, 0, 0));
        int curMax = 0;
        for (int i = 0; i < n; i++) {
            int nextCurMax = curMax;
            Mogura mogura = moguras[i];
            int size = states.size();
            for (int j = 0; j < size; j++) {
                State state = states.poll();
                if(state.p + remPoints[i] <= curMax) {
                    continue;
                }
                states.add(state);
                //System.out.println(state);
                int dtLeft = mogura.t - state.leftT;
                int dxLeftRange = dtLeft * v;
                int dtRight = mogura.t - state.rightT;
                int dxRightRange = dtRight * v;
                int nextPoint = state.p + mogura.p;
                boolean tapped = false;
                if(state.leftX - dxLeftRange <= mogura.x && mogura.x <= state.leftX + dxLeftRange
                        && mogura.x < state.rightX + dxRightRange) {
                    //ツ債カツ偲ィツづつスツつスツつッツづゥ
                    int rightTime = mogura.x < state.rightX ? 0 : (mogura.x - state.rightX + v) / v;
                    int rightX = mogura.x < state.rightX ? state.rightX : mogura.x + 1; 
                    states.add(new State(mogura.x, rightX, mogura.t, state.rightT + rightTime, nextPoint));
                    //System.out.println("addl");
                    tapped = true;
                    
                }
                if(state.rightX - dxRightRange <= mogura.x && mogura.x <= state.rightX + dxRightRange
                        && state.leftX - dxLeftRange < mogura.x) {
                    //ツ右ツ偲ィツづつスツつスツつッツづゥ
                    int leftTime = state.leftX < mogura.x ? 0 : (state.leftX - mogura.x + v) / v;
                    int leftX = state.leftX < mogura.x ? state.leftX : mogura.x - 1; 
                    states.add(new State(leftX, mogura.x, state.leftT + leftTime, mogura.t, nextPoint));
                    tapped = true;
                    //System.out.println("addr");
                }
                if (tapped) {
                    if(nextCurMax < nextPoint) nextCurMax = nextPoint;
                }
            }
            curMax = nextCurMax;
        }
        System.out.println(curMax);
    }
    
    static class State {
        final int leftX;
        final int rightX;
        final int leftT;
        final int rightT;
        final int p;
        
        public State(int leftX, int rightX, int leftT, int rightT, int p) {
            this.leftX = leftX;
            this.rightX = rightX;
            this.leftT = leftT;
            this.rightT = rightT;
            this.p = p;
        }

        @Override
        public String toString() {
            return "State [leftX=" + leftX + ", rightX=" + rightX + ", leftT=" + leftT
                    + ", rightT=" + rightT + ", p=" + p + "]";
        }
    }
    
    static class Mogura implements Comparable<Mogura> {
        final int x;
        final int t;
        final int p;
        public Mogura(int x, int t, int p) {
            this.x = x;
            this.t = t;
            this.p = p;
        }
        @Override
        public int compareTo(Mogura o) {
            return t - o.t;
        }
        @Override
        public String toString() {
            return "Mogura [x=" + x + ", t=" + t + ", p=" + p + "]";
        }
        
        
    }

}