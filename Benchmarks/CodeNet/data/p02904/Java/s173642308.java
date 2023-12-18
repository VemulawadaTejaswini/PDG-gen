import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] P = new int[N];
        for(int i=0; i<N; i++)
            P[i] = sc.nextInt();

        int ans = 1;
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0; i<N; i++) {
            ts.add(P[i]);
            if(i>=K) {
                if(ts.last()!=P[i] || ts.first()!=P[i-K]) {
                    ans++;
                }
                ts.remove(P[i-K]);
            }
        }
//        System.out.println(ts);

        int notChange=0;
        int cnt=1;
//        for(int i=1; i<N; i++) {
//            if(P[i-1]<P[i]) {
//                cnt++;
//                if(cnt==K)
//                    notChange++;
//            } else {
//                cnt=1;
//            }
//        }

        System.out.println(ans - (notChange>=2 ? notChange-1 : 0));
        sc.close();
    }
}
