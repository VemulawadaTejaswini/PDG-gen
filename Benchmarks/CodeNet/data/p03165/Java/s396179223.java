import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        char t[] = sc.next().toCharArray();

        int max = 3005;
        int dp[][] = new int[s.length + 1][t.length + 1];

        for (int i = 1; i < s.length + 1; i++) {
            for (int j = 1; j < t.length + 1; j++) {
                //System.out.println(s[i-1]+" "+t[j-1]);
                if (s[i - 1] == t[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

/*
        for (int i = 0; i < s.length + 1; i++) {
            for (int j = 0; j < t.length + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        
 */


        //System.out.println(dp[s.length][t.length]);

        int inS = s.length;
        int inT = t.length;
        int size = dp[inS][inT];
        String ans = "";

        for(int i=inT;i>0;i--){
            //System.out.println(ans);
            if(dp[inS][i]>dp[inS][i-1]){
                while(true){
                    if(dp[inS][i]>dp[inS-1][i]){
                        //System.out.println(inS+" "+i);
                        ans = s[inS-1]+ans;
                        inS--;
                        break;
                    }
                    inS--;
                }
            }


        }
        System.out.println(ans);


    }
}
