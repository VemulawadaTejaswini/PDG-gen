import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    void solve(){
        String s = in.nextLine();
        long ans = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                long t = Long.parseLong(s.substring(i, j));
                ans += t * Math.pow(2,Math.max(0, i - 1) + Math.max(0, s.length() - j - 1));
            }
        }


        System.out.println(ans);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}