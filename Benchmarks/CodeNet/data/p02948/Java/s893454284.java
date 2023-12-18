import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static class Job implements Comparable<Job> {
        int days;
        int reward;

        public Job(int days, int reward) {
            this.days = days;
            this.reward = reward;
        }

        @Override
        public int compareTo(Job other) {
            return other.reward - this.reward;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Job[] jobs = new Job[N];

        for (int i = 0; i < N; i++) {
            jobs[i] = new Job(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(jobs);

        boolean[] occupied = new boolean[M];

        int sol = 0;

        for (Job job : jobs) {
            int day = M - job.days;
            while (day >= 0 && occupied[day]) day--;
            if (day < 0) continue;
            sol += job.reward;
            occupied[day] = true;
        }

        System.out.println(sol);
    }
}