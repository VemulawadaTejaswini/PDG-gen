import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Ryouri> q = new PriorityQueue<Ryouri>();
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            q.add(new Ryouri(i, a, b));
        }
        long takahashi = 0;
        long aoki = 0;
        for(int i=0; i<n; i++){
            Ryouri r = q.poll();
            if(i%2==0){
                takahashi+=r.a;
            }else{
                aoki+=r.b;
            }
        }
        System.out.println(takahashi-aoki);
    }
}

class Ryouri implements Comparable<Ryouri>{
    int idx;
    long a;
    long b;
    public Ryouri(int idx, int a, int b){
        this.idx = idx;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int compareTo(Ryouri o){
        long tmp = ((long)this.a-this.b) - ((long)o.a - o.b);
        if(tmp==0){
            if(this.a < o.a){
                return -1;
            }else{
                return 1;
            }
        }else if(tmp<0){
            return -1;
        }else{
            return 1;
        }
    }
}