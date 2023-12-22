import java.util.*;

class State {
    private static LinkedList<State> ret = new LinkedList<>();
    private static int[] vy = {0, 1, 0, -1};
    private static int[] vx = {1, 0, -1, 0};

    private int[][] nums;
    private int zeroY, zeroX;
    private int hash;
    int step;

    State(int[][] _nums, int _zeroY, int _zeroX, int _step) {
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

    LinkedList<State> nextMove() {
        ret.clear();
        
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
        Map<Integer, Integer> map = new HashMap<>();
        Queue<State> queue = new LinkedList<>();

        int[][] rootNums = {
                {0, 1, 2, 3},
                {4, 5, 6, 7}
        };
        State rootState = new State(rootNums, 0, 0, 0);

        map.put(rootState.hashCode(), rootState.step);
        queue.add(rootState);

        while (!queue.isEmpty()) {
            State nowState = queue.poll();

            for (State nextState : nowState.nextMove()) {
                if (!map.containsKey(nextState.hashCode())) {
                    map.put(nextState.hashCode(), nextState.step);
                    queue.add(nextState);
                }
            }
        }

        Scanner sc = new Scanner(System.in);

        int hash;
        while (sc.hasNext()) {
            hash = 0;
            for (int i=0; i<8; i++) {
                hash = hash*10 + sc.nextInt();
            }
            System.out.println(map.get(hash));
        }
    }
}