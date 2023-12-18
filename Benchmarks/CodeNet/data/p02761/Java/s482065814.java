import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] s = new int[M];
        int[] c = new int[M];
        int[] cs = new int[N + 1];
        int x = 0;
        String ans = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        s[0] = sc.nextInt();
        c[0] = sc.nextInt();
        list.add(s[0]);

        for(int i=1; i<=N; i++){
            cs[i] = 0;
        }
        cs[s[0]] = c[0];
        loop:for(int i=1; i<M; i++){
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
            for(int j=0; j<i; j++){
                if(s[j]==s[i]){
                    if(c[j]!=c[i]){
                        System.out.println(-1);
                        return;
                    }
                    else{
                        break;
                    }
                }
                if(j==i-1){
                    list.add(s[i]);
                    cs[s[i]] = c[i];
                }
            }
        }

        Collections.sort(list);

        for(int i=1; i<=N; i++){
            if(i==list.get(0)){
                ans += String.valueOf(cs[list.get(x)]);
                x += 1;
            }
            else{
                ans += String.valueOf(cs[i]);
            }
        }
        String a = "0";
        if(ans.charAt(0)==a.charAt(0)){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }
}
