import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        StringBuilder first = new StringBuilder();
        StringBuilder last = new StringBuilder();
        long sum = 0;
        a[0] = Long.parseLong(sc.next());
        for(int i=1; i<N; i++) {
            a[i] = Long.parseLong(sc.next());
            if(i % 2 == 0) last.append(" "+a[i]);
            else first.append(" "+a[i]);
        }
        StringBuilder ans = new StringBuilder();
        if(N % 2 == 0) {
            ans.append(first.reverse());
            ans.append(a[0]);
            ans.append(last);
        }else {
            ans.append(last.reverse());
            ans.append(a[0]);
            ans.append(first);
        }
        System.out.println(String.valueOf(ans));
    }   
}
