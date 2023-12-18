import java.util.Scanner;

public class Main {
    static public void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String[][] dp = new String[2][t.length()+1];
        for(int i = 0 ; i < 2 ; i++){
            dp[i][0] = "";
        }
        for(int j = 0 ; j <= t.length() ; j++){
            dp[0][j] = "";
        }

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = 0 ; j < t.length() ; j++){
                if(s.charAt(i) == t.charAt(j)){
                    dp[(i+1)%2][j+1] = dp[i%2][j] + s.charAt(i);
                }else{
                    if(dp[(i+1)%2][j].length() >= dp[i%2][j+1].length()){
                        dp[(i+1)%2][j+1] = dp[(i+1)%2][j];
                    }else{
                        dp[(i+1)%2][j+1] = dp[i%2][j+1];
                    }
                }
            }
        }

        System.out.println(dp[s.length()%2][t.length()]);
    }
}
