import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;

        int[][] dist = new int[n][n];

        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                int tmpD = j-i;
                if (j<=x || y<=i) {
                    dist[i][j] = tmpD;
                } else {
                    if (i<=x) {
                        tmpD = Math.min(tmpD, x-i+1+Math.abs(j-y));
                        dist[i][j] = tmpD;
                    } else {
                        tmpD = Math.min(tmpD, i-x+1+Math.abs(j-y));
                        dist[i][j] = tmpD;
                    }
                }
//                } else {
//                    tmpD = Math.min(tmpD, x-i+1+y-j>0 ? x-i+y-x+y-j:tmpD);
//                    tmpD = Math.min(tmpD, x-i+j-y+1>0 ? x-i+j-y+1:tmpD);
//                    tmpD = Math.min(tmpD, i-x+1+y-j>0 ? i-x+1+y-j:tmpD);
//                    tmpD = Math.min(tmpD, i-x+1+j-y>0 ? i-x+1+j-y:tmpD);
//                    dist[i][j] = tmpD;
//                }
            }
        }

//        for (int i=0; i<n-1; i++) {
//            for (int j=i+1; j<n-1; j++) {
//                out.print(dist[i][j]);
//
//            } out.println(dist[i][n-1]);
//        }
//        out.flush();

        int[] ans = new int[n-1];

        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (dist[i][j]!=0) {
                    int tmp = dist[i][j]-1;
                    ans[tmp]++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n-1; i++) {
            sb.append(ans[i]+"\n");
        }



        out.print(sb.toString());
        out.flush();



    }

}
