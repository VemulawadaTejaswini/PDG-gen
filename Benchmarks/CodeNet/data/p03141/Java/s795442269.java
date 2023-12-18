import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] used = new boolean[n];
        PriorityQueue<Ryouri> q = new PriorityQueue<Ryouri>();
        PriorityQueue<Ryouri> p = new PriorityQueue<Ryouri>();
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(sc.next());
            q.add(new Ryouri(i, a));
            int b = Integer.parseInt(sc.next());
            p.add(new Ryouri(i, b));
        }
        long ans = 0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                Ryouri r = q.poll();
                while(used[r.idx]){
                    r = q.poll();
                }
                used[r.idx] = true;
                ans+=r.a;
            }else{
                Ryouri r = p.poll();
                while(used[r.idx]){
                    r = p.poll();
                }
                used[r.idx] = true;
                ans-=r.a;
            }
        }
        System.out.println(ans);
    }
}

class Ryouri implements Comparable<Ryouri>{
    int idx;
    int a;
    public Ryouri(int idx, int a){
        this.idx = idx;
        this.a = a;
    }
    
    @Override
    public int compareTo(Ryouri o){
        return this.a - o.a;
    }
}