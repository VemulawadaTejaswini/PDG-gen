import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] time = new int[n];
        int[] dueDate = new int[n];
        Work[] works = new Work[n];

        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
            dueDate[i] = sc.nextInt();
            works[i] = new Work(time[i], dueDate[i]);
        }

        Arrays.sort(works);
        int now = 0;
        for (Work work : works) {
            if (now + work.time <= work.dueDate) {
                now += work.time;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

class Work implements Comparable<Work> {
    int time;
    int dueDate;

    public Work(int time, int dueDate) {
        this.time = time;
        this.dueDate = dueDate;
    }

    @Override
    public int compareTo(Work o) {
        return dueDate - o.dueDate;
    }
}
