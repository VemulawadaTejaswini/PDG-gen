
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static class Job implements Comparable<Job> {
        long a;
        long b;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Job job = (Job) o;
            return a == job.a &&
                    b == job.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        public Job(long a, long b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Job o) {
            if (this.b > o.b) {
                return -1;
            } else if (this.b < o.b) {
                return 1;
            } else {
                if (a > o.a) {
                    return -1;
                } else if (a == o.a) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[n + 1];
        PriorityQueue<Job> jobs = new PriorityQueue<>();
        for (int i = 1; i <= n; ++i) {
            a[i] = scanner.nextLong();
            b[i] = scanner.nextLong();
            jobs.add(new Job(a[i], b[i]));
        }
        List<Long> days = new ArrayList<>(n + 1);
        List<Job> value = new ArrayList<>(n + 1);
        long [] sums = new long[n + 1];
        long sum = 0;
        days.add(0L);
        int i = 1;
        value.add(new Job(0, 0));
        while (!jobs.isEmpty()) {
            Job job = jobs.poll();
            value.add(job);
            if (job.a + i <= m + 1) {
                sum += job.b;
            }
            days.add(Math.max(days.get(i - 1), job.a + i));
            sums[i] = sums[i - 1] + job.b;
            ++i;
        }
        List<Job> reverseValue = new ArrayList<>();
        reverseValue.addAll(value);
        Collections.reverse(reverseValue);
        List<Long> reverseDays = new ArrayList<>();
        reverseDays.addAll(days);
        Collections.reverse(reverseDays);

        for (int start = 2; start <= n; ++start) {
            long leftDays = days.get(start - 1);
            long rightDays = Math.max(0, m + 1 - leftDays);
            int index = Collections.binarySearch(
                    reverseDays,
                    start + rightDays - 1L
            );
            if (index >= 0 && index <= n) {
                long currentSum = sums[index];
                sum = Math.max(sum, currentSum);
            } else {
                int rightIndex = -1 * (index + 1) - 1;
                if (rightIndex >= 0) {
                    sum = Math.max(sum, sums[rightIndex]);
                }
            }

        }
        System.out.println(sum);
    }
}
