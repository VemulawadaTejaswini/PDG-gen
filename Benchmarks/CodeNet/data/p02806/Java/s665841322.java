import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        int[] t = new int[N];
        for(int n=0; n<N; n++){
            s[n]=sc.next();
            t[n]=sc.nextInt();
        }
        String X = sc.next();

        boolean sleep = false;
        int ans = 0;
        for(int n=0; n<N; n++){
            if(sleep) ans += t[n];
            if(X.equals(s[n])) sleep = true;
        }
        System.out.println(ans);
    }

}
