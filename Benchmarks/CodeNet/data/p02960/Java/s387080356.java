import java.util.*;

public class Bonuses{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int mod = (int)1e9+7;
        char arr[] = str.toCharArray();
        int dp[][] = new int[str.length()+1][13];

        dp[0][0]=1;
//        for (int i=0; i<10; i++) dp[0][i]=1;

        for (int i=0; i<str.length(); i++){
            int x = -1;
            if (arr[i]!='?'){
                x = arr[i] - '0';
            }
            for (int j=0; j<10; j++){
                if (x==-1 || x==j){
                    for (int k=0; k<13; k++){
                        int m = (k*10+j)%13;
                        dp[i+1][m] += dp[i][k];
                        dp[i+1][m] %= mod;
                    }
                }
            }
        }

        System.out.println(dp[str.length()][5]);


    }

}