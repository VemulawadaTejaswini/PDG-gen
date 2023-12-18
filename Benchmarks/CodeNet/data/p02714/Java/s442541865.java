import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        long ans = 0;

        int[] cntR = new int[n];
        int[] cntG = new int[n];
        int[] cntB = new int[n];

        int tmpR = 0;
        int tmpG = 0;
        int tmpB = 0;

        for (int i=0; i<n; i++) {
            if (arr[i]=='R') {
                cntR[i] = ++tmpR;
                cntB[i] = tmpB;
                cntG[i] = tmpG;
            } else if (arr[i]=='G') {
                cntG[i] = ++tmpG;
                cntB[i] = tmpB;
                cntR[i] = tmpR;
            } else {
                cntB[i] = ++tmpB;
                cntR[i] = tmpR;
                cntG[i] = tmpG;
            }
        }


        for (int i=0; i<n-2; i++) {
            inner:
            for (int j=i+1; j<n-1; j++) {
                char first = arr[i];
                char second = arr[j];
                if (first==second) continue inner;
//                char[] rgb = {'R', 'G', 'B'};
                int cR = 0;
                int cG = 0;
                int cB = 0;
                if (first=='R') cR++;
                if (first=='G') cG++;
                if (first=='B') cB++;
                if (second=='R') cR++;
                if (second=='G') cG++;
                if (second=='B') cB++;
                char third = 'X';
                if (cR==0) third = 'R';
                if (cG==0) third = 'G';
                if (cB==0) third = 'B';

                if (j+(j-i)>=n) {
                    if (third=='R') {
                        ans += cntR[n-1]-cntR[j];
                    } else if (third=='G') {
                        ans += cntG[n-1]-cntG[j];
                    } else {
                        ans += cntB[n-1]-cntB[j];
                    }
                } else {
                    if (third=='R') {
                        if (arr[j+(j-i)]=='R') ans += (cntR[n-1]-cntR[j]-1);
                        else ans += (cntR[n-1]-cntR[j]);
                    } else if (third=='G') {
                        if (arr[j+(j-i)]=='G') ans += (cntG[n-1]-cntG[j]-1);
                        else ans += (cntG[n-1]-cntG[j]);
                    } else {
                        if (arr[j+(j-i)]=='B') ans += (cntB[n-1]-cntB[j]-1);
                        else ans += (cntB[n-1]-cntB[j]);
                    }

                }
//                System.out.print(ans);
            }
        }

        System.out.println(ans);

    }

}
