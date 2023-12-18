import java.util.*;

class Main {
    static final int N=3000;
    static boolean[] f(int a,int b){
        boolean[]r=new boolean[N];
        Queue<Integer>q=new ArrayDeque<Integer>();
        q.add(0);
        while(q.size()>0){
            int t=q.poll();
            if(t>=N)continue;
            if(r[t])continue;
            r[t]=true;
            q.add(t+a);
            q.add(t+b);
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e=scan.nextInt();
        int f=scan.nextInt();
        boolean[]ab=f(a,b);
        boolean[]cd=f(c,d);
        double m=0.0;
        int mx=100*a,my=0;
        for(int i=1;i<N;++i)
            if(ab[i])
                for(int j=0;j<N;++j)
                    if(cd[j]&&j<=e*i&&100*i+j<=f){
                        double r=(double)j/(double)i;
                        if(m<r){
                            m=r;
                            mx=100*i+j;
                            my=j;
                        }
                    }
        System.out.println(mx+" "+my);
    }
}
