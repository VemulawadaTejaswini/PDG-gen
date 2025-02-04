import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().main();
    }
    
    void main() {
        Scanner sc = new Scanner(System.in);
        
        int[][] a = new int[100][100];
        int i = 0;
        while(sc.hasNext()) {
            String s = sc.nextLine();
            String[] temp = s.split(",");
//            System.out.println(temp.length);
            for(int j=0;j<temp.length;j++) {
//            	System.out.print(temp[j] + " ");
                a[i][j] = Integer.parseInt(temp[j]);
//                System.out.println(a[i][j]);
            }
//            System.out.println();
            i++;
        }
       // System.out.println(i);
        int e = (i/2) + 1;
        int[][] dp = new int[e][e];
        int ind = 0;
        for(int k=0;k<e;k++) {
            for(int j=0;j<e;j++) {
                int min = Math.min(k+j+1, (2*e) - (k+j+1));
                if(k+j < e) {
                    dp[k][j] = a[k+j][min-1-k];
                    ind = min-1-k;
                }else {
                    dp[k][j] = a[k+j][ind];
                }
            }
        }
        
        // for(int k=0;k<e;k++) {
        // 	for(int j=0;j<e;j++) {
        // 		System.out.print(dp[k][j]);
        // 	}
        // 	System.out.println();
        // }
        
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
