import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List max(List a, List b){
        if(a.size() > b.size())
            return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        List<Integer>[][] dp = new ArrayList[s.length()+1][t.length()+1];

        for(int i = 0; i < t.length()+1; i++){
            dp[0][i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < s.length()+1; i++){
            dp[i][0] = new ArrayList<Integer>();
        }

        for(int i = 1; i < s.length()+1; i++){
            for(int j = 1; j < t.length()+1; j++){
                dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
                if(s.charAt(i-1) == t.charAt(j-1)){
                    ArrayList list = new ArrayList(dp[i-1][j-1]);
                    list.add(i);
                    dp[i][j] = max(dp[i][j],list);
                }
            }
        }

        for(Integer i : dp[s.length()][t.length()]){
            System.out.print(s.charAt(i-1));
        }
    }
}
