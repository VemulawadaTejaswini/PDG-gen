import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        long K = sc.nextLong();
        
        char[] ans = new char[N];

        for(int n=0; n<N-1; n++){
            if(S.charAt(n)+K > 'z'){
                K -= ('z' + 1 - S.charAt(n));
                ans[n] = 'a';
            }else{
                ans[n] = S.charAt(n);
            }
        }

        K %= 26;
        ans[N-1] = (char)(((S.charAt(N-1)-'a') + K) %26 + 'a');
        for(int n=0; n<N; n++) System.out.print(ans[n]);
        System.out.println();
    }
}
