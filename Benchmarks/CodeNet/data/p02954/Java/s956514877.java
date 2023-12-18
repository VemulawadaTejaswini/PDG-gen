import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int n=S.length();
        char[] s = S.toCharArray();
        int[] ans = new int[n];

        int i=0;
        while(i<n){
            int Rcnt=0;
            while(i<n && s[i]=='R'){
                i++;
                Rcnt++;
            }
            int ni=i;
            ans[ni-1]=ans[ni-1]+(Rcnt+1)/2;
            ans[ni]=ans[ni]+Rcnt/2;

            int Lcnt=0;
            while(i<n && s[i]=='L'){
                i++;
                Lcnt++;
            }
            ans[ni-1]=ans[ni-1]+Lcnt/2;
            ans[ni]=ans[ni]+(Lcnt+1)/2;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(ans[j] + " ");
        }
    }
}
