import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        int N=sc.nextInt(),M=sc.nextInt(),i=0;
        List<Pair> cost=new ArrayList<>();
        for(i=0;i<N;i++){
            cost.add(new Pair(sc.nextInt(),sc.nextInt()));
        }
        i=0;
        Collections.sort(cost,new PconA());
        long n=0;
        while(M>0){
            long m=Math.min(cost.get(i).b, M);
            n+=(cost.get(i).a)*m;
            M-=m;
            i++;
        }
        System.out.println(n);
    }
}
class Pair{
    long a,b;
    public Pair(long a,long b){
        this.a=a;
        this.b=b;
    }
}
class PconA implements Comparator<Pair>{
    @Override
    public int compare(Pair p1,Pair p2){
        return p1.a<p2.a ? -1:1;
    }
}