import java.util.*;

public class SummerVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfJobs = scanner.nextInt();
        int remainingDays = scanner.nextInt();
        List<JobInfo> pairs = new ArrayList<>();
        for (int i = 0; i < numberOfJobs; i++) {
            int days = scanner.nextInt();
            int reward = scanner.nextInt();
            if (days <= remainingDays)
                pairs.add(new JobInfo(days, reward));
        }
        int size = 1;
        int totalReward = 0;
        PriorityQueue<JobInfo> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> -a.reward));
        while (size <= remainingDays) {

            for (int i = 0; i < pairs.size(); i++) {
                JobInfo info = pairs.get(i);
                if (info.days <= size) {
                    if (!priorityQueue.contains(info)) {
                        priorityQueue.add(info);
                        pairs.remove(info);
                    }
                }
            }
            if (!priorityQueue.isEmpty())
                totalReward += priorityQueue.poll().reward;
            size++;
        }
        System.out.println(totalReward);
    }

    private static class JobInfo {
        int days;
        int reward;

        public JobInfo(int days, int reward) {
            this.days = days;
            this.reward = reward;
        }
    }
}
