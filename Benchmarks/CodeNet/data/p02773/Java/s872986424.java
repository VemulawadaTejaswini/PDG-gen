import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] S = new String[N];
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<N; i++){
            S[i] = sc.next();
            list.add(S[i]);
        }

        Collections.sort(list);

        int[] sum = new int[N];
        int x = 0;
        int max = 0;
        String[] ans = new String[N];
        for(int i=0; i<N; i++){
            sum[i] = 1;
        }
        for(int i=1; i<N; i++){
            if(list.get(i).equals(list.get(i-1))){
                sum[x] += 1;
            }
            else{
                ans[x] = list.get(i - 1);
                max = Math.max(max, sum[x]);
                x += 1;
            }
            if(i==N-1){
                ans[x] = list.get(i);
                max = Math.max(max, sum[x]);
            }
        }
        for(int i=0; i<=x; i++){
            if(sum[i]==max){
                System.out.println(ans[i]);
            }
        }
    }
}
