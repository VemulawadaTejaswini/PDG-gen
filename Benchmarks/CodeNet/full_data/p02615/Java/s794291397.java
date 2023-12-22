import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            q.offer(sc.nextInt());
        }
        long res = 0;
        int curr = q.poll();
        if(!q.isEmpty()){
            res += curr;
            curr = q.poll();
        }
        int sec = -1;
        int thr = -1;
        while(!q.isEmpty()){
            if(sec == -1) {
                sec = q.poll();
            }
            else if(thr == -1) {
                thr = q.poll();
            }
            else{
                curr = sec;
                sec = thr;
                thr = q.poll();
            }
            res += curr;
        }
        System.out.println(res);
    }
}