import java.util.*;
import java.util.function.*;
import java.lang.*;

public class Main {
    static int countBlack(String s){
        int N = s.length();
        int ans=0;
        for(int n=0; n<N; n++) if(s.charAt(n)=='#') ans++;
        return ans;
    }
    static int countWhite(String s){
        return s.length()-countBlack(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        //make it "....####"

        int ans = countWhite(S); //all-black is a possible solution
        int cur = ans;
        for(int n=0; n<N; n++){
            if(S.charAt(n)=='.') cur--;
            else cur++;

            ans = Math.min(ans,cur);
        }

        System.out.println(ans);


    }
}