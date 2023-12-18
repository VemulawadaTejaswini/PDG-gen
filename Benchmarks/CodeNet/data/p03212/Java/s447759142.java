import java.util.*;
import java.io.*;

public class Main {
    public static long to753(int n){
        if(n==0) return 0;
        if(n==1) return 3;
        if(n==2) return 5;
        if(n==3) return 7;
        return 10* to753(n/4) + to753(n%4);
    }
    public static boolean is753(long shichigosan){
        String S = Long.toString(shichigosan);
        return S.contains("3") && S.contains("5") && S.contains("7") && !S.contains("0");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = 0;
        for(int n=0;n<=1000000; n++){
            long shichigosan = to753(n);
            if(shichigosan >N) break;
            //System.out.print(n+" "+shichigosan);
            if(is753(shichigosan) && shichigosan <= N){
                ans++;
                //ystem.out.println("!");
            }else{
                //System.out.println("?");
            }
        }
        System.out.println(ans);
    }
}