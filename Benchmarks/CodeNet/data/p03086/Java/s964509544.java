import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        int out = 0;
        for(int i = 0; i < n; i++){
            a:for(int j = i; j <= n; j++){
                String t = s.substring(i, j);
                for(int k = 0; k < t.length(); k++){
                    if(t.charAt(k) != 'A' && t.charAt(k) != 'C' && t.charAt(k) != 'G' && t.charAt(k) != 'T') continue a;
                }
                out = Math.max(out, t.length());
            }
        }
        System.out.println(out);
    }


    public static void main(String[] args){
        new Main().solve();
    }
}
