import java.util.*;
import java.io.*;

public class Main {

    static int startWithBlack(String S){
        int N = S.length();
        int ans = 0;
        for(int n=0; n<N; n++){
            if((n%2==0)^(S.charAt(n)=='0')){
                ans++;
            }
        }
        return ans;
    }
    static int startWithWhite(String S){
        int N = S.length();
        int ans = 0;
        for(int n=0; n<N; n++){
            if((n%2==0)^(S.charAt(n)=='1')){
                ans++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(Math.min(startWithBlack(S), startWithWhite(S)));

    }
}
