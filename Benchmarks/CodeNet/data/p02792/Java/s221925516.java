import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int nLen = String.valueOf(n).length();


        int[][] cnt = new int[9][9];

        int ans = 0;


        for (int i=1; i<=n; i++){
            int nLen = String.valueOf(i).length();

            if (String.valueOf(i).length()==1) {
                cnt[i-1][i-1]++;
                continue;
            }
            int top = i/(int)Math.pow(10, nLen-1);
            int bottom = i%10;
            if (top==0 || bottom==0) continue;
            cnt[top-1][bottom-1]++;
        }

        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                ans += cnt[i][j]*cnt[j][i];
            }
        }
        System.out.println(ans);

    }
}
