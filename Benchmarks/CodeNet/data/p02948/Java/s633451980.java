import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Job[] jobs = new Job[n];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<n; i++) jobs[i] = new Job(sc.nextInt(), sc.nextInt());

        Arrays.sort(jobs, (ac, bc)->(ac.a - bc.a));
        long cnt = 1;
        long ans = 0;
        for(int i = 0; i<n; i++) {
            if(jobs[i].a == cnt) queue.add(jobs[i].b);
            else {
                while(jobs[i].a != cnt) {
                    if (queue.size() != 0) ans += (long)queue.poll();
                    System.err.println("ans = " +cnt+" "+ ans);
                    cnt++;
                    if(cnt>m) {
                        System.err.println("ans = " + ans);
                        return;
                    }
                }
                queue.add(jobs[i].b);
            }
        }
        //System.err.println("day = " + cnt);
        while(cnt<=m && queue.size()!=0) {
            ans+= (long)queue.poll();
            System.err.println("ans = " + ans);
            cnt++;
        }

        System.out.println(ans);

    }
}
class Job {
    int a,b;
    public Job(int a, int b) {
        this.a = a;
        this.b = b;
    }
}