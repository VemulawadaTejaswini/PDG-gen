import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    class Process {
        final String name;
        int time;
        public Process(String name, int time) {
            this.name = name;
            this.time = time;
        }

        public int run(int time) {
            int pre = this.time;
            this.time = Math.max(0, this.time - time);
            return pre - this.time;
        }

        public boolean isFinished() {
            return this.time == 0;
        }
    }

    class Result {
        final String name;
        final int finishedTime;
        public Result(String name, int time) {
            this.name = name;
            finishedTime = time;
        }
    }

    void solve() {
        // Input
        int n = sc.nextInt();
        int q = sc.nextInt();
        Queue<Process> que = new ArrayDeque<>();
        for(int i= 0; i<n;i++) {
            que.add(new Process(sc.next(), sc.nextInt()));
        }

        // Solve
        List<Result> results = new ArrayList<>();
        int time = 0;
        while (!que.isEmpty()) {
            Process top = que.poll();
            time += top.run(q);
            if(top.isFinished()) {
                results.add(new Result(top.name, time));
            } else {
                que.add(top);
            }
        }

        // Output
        for(Result result : results) {
            System.out.println(String.format("%s %d", result.name, result.finishedTime));
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}

