import java.util.Scanner;

public class Main {

    static String[][] dp;

    static String  max(String a, String b){
        if(a != null && b != null)
            if(a.length() >= b.length())
                return a;
            else
                return b;
        else{
            if( a == null )
                return b;
            else
                return a;
        }
    }

    static String max(String a, String b, String c){
        if(a != null && b != null && c != null){
            if(a.length() >= b.length() && a.length() >= c.length()){
                return a;
            }else if(b.length() >= a.length() && b.length() >= c.length()){
                return b;
            }else{
                return c;
            }
        }else{
            if( a== null)
            return max(b,c);
            if( b == null)
                return max(a,c);
            else
                return max(a,b);
        }
    }
    static String calculate(String s, String t, int i, int j){
        if(i < 0 || j < 0){
            return "";
        }else {
            if(dp[i][j] != null){
                return dp[i][j];
            }else {
                dp[i][j] = max(calculate(s,t,i,j-1),calculate(s,t,i-1,j),calculate(s,t,i-1,j-1)+(s.charAt(i)==t.charAt(j)?s.charAt(i):""));
                return dp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        dp = new String[s.length()][t.length()];

        for(int i =0; i < s.length(); i++){
            for(int j =0; j < t.length(); j++){
                dp[i][j] = null;
            }
        }

        String ans = calculate(s,t,s.length()-1,t.length()-1);
        System.out.println(ans);
    }
}
