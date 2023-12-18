import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static ArrayList<Integer>[] rec;
    static int[] tar;
    static int A,B,C;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), Q = sc.nextInt();
        TreeSet<Long> s = new TreeSet<>(), t = new TreeSet<>();
        for(int i=0;i<A;i++) s.add(sc.nextLong());
        for(int i=0;i<B;i++) t.add(sc.nextLong());
        PrintWriter out = new PrintWriter(System.out);
        for(int i=0;i<Q;i++){
            long x = sc.nextLong();
            long ans = Long.MAX_VALUE/10;
            // left-left
            Long sh = s.floor(x), te = t.floor(x);
            if(sh!=null&&te!=null) ans = Math.min(ans,x-Math.min(te,sh));
            //right-right
            sh = s.ceiling(x); te = t.ceiling(x);
            if(sh!=null&&te!=null) ans = Math.min(ans,Math.max(sh,te)-x);
            // left-right ceiling(x) >= x >= floor(x)
            sh = s.ceiling(x); te = t.floor(x);
            if(sh!=null&&te!=null) ans = Math.min(ans,Math.abs(te-sh)+Math.min(sh-x,x-te));
            sh = s.floor(x); te = t.ceiling(x);
            if(sh!=null&&te!=null) ans = Math.min(ans,Math.abs(te-sh)+Math.min(te-x,x-sh));
            out.println(ans);
        }
        out.flush();
    }
}