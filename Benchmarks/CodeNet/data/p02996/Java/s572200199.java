import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] tasks = new Pair[n];
        for(int i = 0; i < n; i++) {
          tasks[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(tasks, (i, j) -> i.endTime - j.endTime);
        int currentTime = 0;
        for(int i = 0; i < n; i++) {
            Pair t = tasks[i];
            currentTime += t.time;
            if(currentTime > t.endTime) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    static class Pair {
        int time;
        int endTime;
        Pair(int time, int endTime) {
            this.time = time;
            this.endTime = endTime;
        }
    }
}
