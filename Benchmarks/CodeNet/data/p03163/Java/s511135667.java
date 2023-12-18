
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static N[] ns;
    HashMap<N,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        ns = new N[N];
        for(int i = 0 ; i < N;i++)
        {
            ns[i] = new N(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(ns);
        System.out.println(calculate(W,0,N));

    }
    static long calculate(int w,long v,int n)
    {


        if(w == 0 || n == 0)
            return v;

        if(w < ns[n-1].w)
            return calculate(w,v,n-1);
        else
        {
            return Math.max(calculate(w-ns[n-1].w,v+ns[n-1].v,n-1),calculate(w,v,n-1));
        }

    }
    static class MKey implements Comparable<MKey> {
        int n ,w;

        @Override
        public int compareTo(MKey o) {
            if(w == o.w)
                return 0;
            return w>o.w?1:-1;
        }


        public MKey(int n , int w)
        {
            this.n = n;
            this.w = w;
        }

        @Override
        public boolean equals(Object obj) {
            MKey k = (MKey) obj;
            return k.n == n && k.w == w;
        }

        @Override
        public int hashCode() {
            return n+w;
        }
    }
    static class N implements Comparable<N>
    {
        @Override
        public int compareTo(N o) {
            if(w == o.w)
                return 0;
            return w>o.w?1:-1;
        }

        int w,v;
        public N(int w,int v)
        {
            this.w = w;
            this.v = v;
        }

    }
}
