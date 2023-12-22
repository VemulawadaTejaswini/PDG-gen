import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().main();
    }
    
    void main() {
        Scanner sc = new Scanner(System.in);
        
        int[][] a = new int[100][100];
        char[] temp = new char[100];
        int i = 0;
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            int le = s.length();
//            System.out.println(le);
//            System.out.println(s);
            int p = 0;
            for(int j=0;j<le;j++) {
                if(s.charAt(j) != ',') {
                	temp[p] = s.charAt(j);
                	p++;
                }
            }
            for(int j=0;j<p;j++) {
                a[i][j] = temp[j] - '0';
//                System.out.println(temp[j]);
            }
            i++;
        }
        i--;
        int e = i/2 + 1;
        int[][] dp = new int[e][e];
        int ind = 0;
        for(int k=0;k<e;k++) {
            for(int j=0;j<e;j++) {
                int min = Math.min(k+1, 2*e - (k+1));
                if(k+j < e) {
                    dp[k][j] = a[k+j][min-1-k];
                    ind = min-1-k;
                }else {
                    dp[k][j] = a[k+j][ind];
                }
            }
        }
        for(int j=1;j<e;j++) {
            dp[0][j] += dp[0][j-1];
        }
        for(int k=1;k<e;k++) {
            dp[k][0] += dp[k-1][0];
        }
        for(int k=1;k<e;k++) {
            for(int j=1;j<e;j++) {
                dp[k][j] += Math.max(dp[k-1][j], dp[k][j-1]);
            }
        }
        System.out.println(dp[e-1][e-1]);
    }

}
