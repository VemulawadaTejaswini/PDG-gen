import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N-1];
        int b[] = new int[N-1];
        int c[] = new int[N-1];
        int Q, K;
        int i;
        int s, t;
        long ans;

        for(i=0;i<N-1; i++){
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            c[i] = sc.nextInt();
        }
        Q = sc.nextInt();
        K = sc.nextInt();
        K -= 1;
        long d[] = new long[N];
        int prev[] = new int[N];
        Set<Integer> vert = new HashSet<>();
        for(i=0;i<N;i++){
            vert.add(i);
            d[i] = -1;
            prev[i] = -1;
        }
        d[K] = 0;
        while(!(vert.isEmpty())){
            long min = -1;
            int j = -1;
            for(int v : vert){
                if(min == -1 || d[v] < min){
                    min = d[v];
                    j = v;
                }
            }
            vert.remove(j);
            for(i = 0; i<N-1; i++){
                if(a[i] == j){
                    if(d[b[i]] == -1 || d[b[i]] > d[j] + c[i]){
                        d[b[i]] = d[j] + c[i];
                        prev[b[i]] = j;
                    }
                }else if(b[i] == j){
                    if(d[a[i]] == -1 || d[a[i]] > d[j] + c[i]){
                        d[a[i]] = d[j] + c[i] + 2;
                        prev[a[i]] = j;
                    }
                }

            }

        }

        for(i=0;i<Q;i++){
            s = sc.nextInt();
            s -= 1;
            t = sc.nextInt();
            t -= 1;
            ans = d[s] + d[t];
            System.out.println(ans);
        }
    }
}
