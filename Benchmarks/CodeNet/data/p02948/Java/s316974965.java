import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int numOfJob = sc.nextInt(); // N
        int deadline = sc.nextInt(); // M
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < numOfJob; i++) {
            int delay = sc.nextInt(); // A[i]
            int reward = sc.nextInt(); // B[i]
            jobs.add(new Job(delay, reward));
        }

        int ans = 0;
        // 制約の厳しい後ろの日程から見ていく。
        // こういう問題では制約の大きい方から見ていくのが定石らしい。
        // 制約が大きい方が決まりやすいからかな。
        for (int day = deadline - 1; day >= 0; day--) {
            int havingDay = deadline - day;
            // jobsを引数で渡せば、ローカル変数で済む。
            Job bestJob = findBestJob(jobs, havingDay);
            if (bestJob == null) continue;
            ans += bestJob.getReward();
            // 一度使ったjobは使用できないので、削除する。
            // removeの引数には、jobオブジェクトを指定できる。
            jobs.remove(bestJob);
        }

        System.out.print(ans);
    }

    Job findBestJob(List<Job> jobs, int havingDay) {
        List<Job> candidates = new ArrayList<>();
        for (Job job : jobs) {
            if (job.getDelay() <= havingDay) {
                candidates.add(job);
            }
        }
        if (candidates.size() == 0) return null;
        candidates.sort((a, b) -> b.reward - a.reward);
        return candidates.get(0);
    }

    class Job {
        int delay;
        int reward;

        Job(int delay, int reward) {
            this.delay = delay;
            this.reward = reward;
        }
        public int getDelay() {
            return delay;
        }
        public int getReward() {
            return reward;
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}