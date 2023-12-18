import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int maxa = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            list.add(b[i]);
            maxa = Math.max(maxa, a[i]);
        }
        Collections.sort(list);
        int sum = 0;
        int bat = 0;
        for(int i=N-1; i>=0; i++){
            if(list.get(i)>maxa){
                sum += b[i];
                bat += 1;
            }
            if(sum>=H){
                break;
            }
        }
        int ans = 0;
        if(sum>=H){
            ans = bat;
        }
        else{
            sum = H - sum;
            if(sum%maxa==0){
                ans = sum / maxa + bat;
            }
            else{
                ans = sum / maxa + 1 + bat;
            }
        }
        System.out.println(ans);
    }
}