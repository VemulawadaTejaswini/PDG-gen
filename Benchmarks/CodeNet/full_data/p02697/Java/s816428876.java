import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] diffs = new boolean[N];
        boolean[] used = new boolean[N+1];
        Arrays.fill(diffs, true);
        Arrays.fill(used, false);
        diffs[0]=false;
        for(int i=0;i<M;i++){
            int a=1;
            while(used[a]){
                a++;
                if(a == N){
                    a = 1;
                }
            }
            int dif= 1;
            while(!diffs[dif] && !used[a+dif % N]){
                dif++;
            }
            int b=a+dif;
            System.out.println(a + " " + b);
            used[a]=true;
            used[b]=true;
            diffs[dif]=false;
        }

    }
}
