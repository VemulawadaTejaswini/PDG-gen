import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Long> li = new ArrayList<Long>();
        for(int i = 0; i < n; i++){
            li.add(sc.nextLong());
        }
        Collections.sort(li);
        ArrayList<Change> cs = new ArrayList<Change>();
        for(int i = 0; i < m; i++){
            int count = sc.nextInt();
            long diff = sc.nextLong();
            cs.add(new Change(count,diff));
        }
        Collections.sort(cs);
        int index = 0;
        Queue<Long> q = new PriorityQueue<Long>();
        for(Change c : cs){
            for(int j = 0; j < c.count; j++){
                long d = li.get(index);
                if(d >= c.diff){
                    break;
                }else{
                    q.add(d);
                    index++;
                }
            }
            int j = 0;
            while(q.size() > 0 && j < c.count){
                q.poll();
                q.add(c.diff);
                j++;
            }
        }
        long ans = 0;
        while(q.size() != 0){
            ans += q.poll();
        }
        for(int i = index; i < n; i++){
            ans += li.get(i);
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

