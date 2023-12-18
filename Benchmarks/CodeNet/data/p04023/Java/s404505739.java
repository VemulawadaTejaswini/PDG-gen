import java.util.*;

class PL implements Comparable<PL>{
    long x,y;
    PL(long x,long y){
        this.x=x;this.y=y;
    }
    @Override
    public int compareTo(PL o){
        return Long.compare(x,o.x);
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}

class Main {
    Main(int n,long[]k){
        int m=k.length;
        Queue<PL> q=new PriorityQueue<PL>(Collections.reverseOrder());
        q.add(new PL(k[m-1],1));
        long f=k[0];
        long[]a=new long[n];
        for(int i=m-2;i>=0;--i){
            while(q.size()>0&&q.peek().x>k[i]){
                PL t=q.poll();
                long x=t.x,y=t.y;
                long qq=x/k[i],r=x%k[i];
                q.add(new PL(k[i],y*qq));
                if(r>f)
                    q.add(new PL(r,y));
                else
                    a[(int)(r-1)]+=y;
            }
        }
        while(q.size()>0){
            PL t=q.poll();
            long x=t.x,y=t.y;
            a[(int)(x-1)]+=y;
        }
        for(int i=n-2;i>=0;--i)a[i]+=a[i+1];
        for(long aa:a)System.out.println(aa);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.next());
        int q=Integer.parseInt(scan.next());
        int p=1;
        long[] k=new long[q+1];
        k[0]=n;
        for(int i=0;i<q;++i){
            long u=Long.parseLong(scan.next());
            while(p>0&&k[p-1]>=u)p--;
            k[p++]=u;
        }
        new Main(n,Arrays.copyOf(k,p));
    }
}
