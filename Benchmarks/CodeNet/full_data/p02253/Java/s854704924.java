import java.util.PriorityQueue;
import java.util.Scanner;

class Activity implements Comparable<Activity> {
    int s;
    int t;

    Activity(int s, int t) {
        this.s = s;
        this.t = t;
    }

    public int compareTo(Activity act) {
        return t - act.t;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        PriorityQueue<Activity> que = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            que.add(new Activity(s, t));
        }

        int res = 0;
        int time = 0;
        while(!que.isEmpty()) {
            Activity act = que.poll();
            if(time >= act.s) continue;

            res++;
            time = act.t;
        }

        System.out.println(res);
 
        sc.close();
    }
}
