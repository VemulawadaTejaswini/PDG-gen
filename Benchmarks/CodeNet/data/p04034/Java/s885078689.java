import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private int red;
    private final Box[] boxes;
    private final Step[] steps;

    private final Set<Integer> positions;

    public Main(Box[] boxes, Step[] steps){
        this.boxes = boxes;
        this.steps = steps;
        positions = new HashSet<>();
        red = 0;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(new InputStreamReader(System.in));
        int n = s.nextInt();
        int m = s.nextInt();
        Box[] boxes = new Box[n];
        for(int i = 0; i < n; i++){
            boxes[i] = new Box(i == 0 ? 0 : 1);
        }
        Step[] steps = new Step[m];
        for(int i = 0; i < m; i++){
            int from = s.nextInt() - 1;
            int to = s.nextInt() - 1;
            steps[i] = new Step(from, to);
        }
        Main boxAndBall = new Main(boxes, steps);
        boxAndBall.recurse(0);
        System.out.println(boxAndBall.getPositions().size());
    }

    public void recurse(int step){
        if(step == steps.length) {
            positions.add(red);
            return;
        }

        Step current = steps[step];
        if(current.from == red){
            if(boxes[current.from].whiteBalls > 0){
                moveWhiteBall(step);
            }
            moveRedBall(step);
        } else {
            moveWhiteBall(step);
        }
    }

    public Set<Integer> getPositions() {
        return positions;
    }

    private void moveWhiteBall(int step) {
        boxes[steps[step].from].whiteBalls--;
        boxes[steps[step].to].whiteBalls++;
        recurse(step + 1);
        boxes[steps[step].from].whiteBalls++;
        boxes[steps[step].to].whiteBalls--;
    }

    private void moveRedBall(int step) {
        red = steps[step].to;
        recurse(step + 1);
        red = steps[step].from;
    }

    public static class Box {
        int whiteBalls;
        public Box(int numOfWhite){
            whiteBalls = numOfWhite;
        }
    }

    public static class Step {
        public final int from;
        public final int to;
        public Step(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}
