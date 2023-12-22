import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    /**
     * @param args
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            if(N==0)break;
            Set<Integer>[] set = new Set[N];
            for (int i = 0; i < set.length; i++) {
                set[i]=new HashSet<Integer>();
            }
            for (int i = 0; i < N; i++) {
                int M = sc.nextInt();
                for (int j = 0; j < M; j++) {
                    set[i].add(sc.nextInt()-1);
                }
                set[i].add(i);
            }
            boolean[] can = new boolean[N];
            Arrays.fill(can, true);
            int K =sc.nextInt();
            for (int i = 0; i < K; i++) {
                int a = sc.nextInt()-1;
                for (int j = 0; j < set.length; j++) {
                    if(!set[j].contains(a)){
                        can[j]=false;
                    }
                }
            }
            int ans=-1;
            int cnt=0;
            for (int i = 0; i < can.length; i++) {
                if(can[i]){
                    ans=i+1;
                    cnt++;
                }
            }
            if(cnt>=2){
                System.out.println(-1);
            } else 
                System.out.println(ans);
        }
    }

}