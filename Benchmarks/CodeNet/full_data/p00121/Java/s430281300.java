import java.util.*;

class State {
    private static int[] vy = {0, 1, 0, -1};
    private static int[] vx = {1, 0, -1, 0};

    private int[][] nums;
    private int zeroY, zeroX;
    private int hash;
    int step;

    public State(int[][] _nums, int _zeroY, int _zeroX, int _step) {
        nums = _nums;
        zeroY = _zeroY;
        zeroX = _zeroX;
        hash = -1;
        step = _step;
    }

    @Override
    public int hashCode() {
        if (hash != -1) return hash;
        hash = 0;
        for (int y=0; y<2; y++) {
            for (int x=0; x<4; x++) {
                hash = hash*10 + nums[y][x];
            }
        }
        return hash;
    }

    public LinkedList<State> nextMove() {
        LinkedList<State> ret = new LinkedList<>();

        for (int i=0; i<4; i++) {
            int nextZeroY = zeroY + vy[i];
            if (nextZeroY < 0 || nextZeroY >= 2) continue;
            int nextZeroX = zeroX + vx[i];
            if (nextZeroX < 0 || nextZeroX >= 4) continue;

            int[][] nextNums = new int[2][4];
            for (int y=0; y<2; y++) {
                for (int x=0; x<4; x++) {
                    nextNums[y][x] = nums[y][x];
                }
            }

            nextNums[nextZeroY][nextZeroX] = 0;
            nextNums[zeroY][zeroX] = nums[nextZeroY][nextZeroX];
            ret.add(new State(nextNums, nextZeroY, nextZeroX, step+1));
        }
        return ret;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<State> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        State firstState;
        int[][] firstNums = new int[2][4];
        int firstZeroY = -1, firstZeroX = -1;

        while (sc.hasNext()) {
            for (int y=0; y<2; y++) {
                for (int x=0; x<4; x++) {
                    firstNums[y][x] = sc.nextInt();
                    if (firstNums[y][x] == 0) {
                        firstZeroY = y;
                        firstZeroX = x;
                    }
                }
            }
            firstState = new State(firstNums, firstZeroY, firstZeroX, 0);

            set.add(firstState.hashCode());
            queue.add(firstState);

            while (!queue.isEmpty()) {
                State nowState = queue.poll();

                if (nowState.hashCode() == 1234567) {
                    System.out.println(nowState.step);
                    break;
                }

                for (State nextState : nowState.nextMove()) {
                    if (!set.contains(nextState.hashCode())) {
                        set.add(nextState.hashCode());
                        queue.add(nextState);
                    }
                }
            }

            queue.clear();
            set.clear();
        }
    }