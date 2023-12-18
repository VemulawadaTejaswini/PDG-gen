import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Long> q = new PriorityQueue<Long>();
        for(int i = 0; i < n; i++){
            q.add(sc.nextLong());
        }
        int[] li2 = new int[n];
        ArrayList<Change> changes = new ArrayList<Change>();
        for(int i = 0; i < m; i++){
            int count = sc.nextInt();
            long diff = sc.nextLong();
            for(int j = 0; j < count; j++){
                long d = q.peek();
                if(d >= diff){
                    break;
                }else{
                    q.poll();
                    q.add(diff);
                }
            }
        }
        long ans = 0;
        while(q.size() != 0){
            ans += q.poll();
        }
        System.out.println(ans);
    }
}

class Change implements Comparable<Change>{
    int count;
    long diff;
    public Change(int c, long d){
        this.count = c;
        this.diff = d;
    }
    public int compareTo(Change c){
        if(this.diff < c.diff){
            return -1;
        }else if(this.diff > c.diff){
            return 1;
        }
        return 0;
    }
}

