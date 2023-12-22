/*
@author James Fisher
@date
@version
*/

import java.util.Scanner;

public class Main {

    private int max(int a, int b){
        return (a > b)? a : b;
    }

    private int lcs(char[] X, char[] Y, int m, int n){
/*        if (m == n)
            return 0;
        if(X[m-1] == Y[n-1])
            return 1 + lcs(X, Y, m-1, n-1);
        else
            return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));*/


        int L[][] = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || j == 0)
                    L[i][j] = 0;
                else if(X[i - 1] == Y[j - 1]){
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = max(L[i - 1][j], L[i][j-1]);
                }
            }
        }
        return L[m][n];
    }

    public static void main(String[] args) {
        Main lcs = new Main();
        Scanner sc = new Scanner(System.in);

        int runLength = sc.nextInt();

        for(int i = 0; i < runLength; i++){
            String input1 = sc.next();
            String input2 = sc.next();

            char[] X = input1.toCharArray();
            char[] Y = input2.toCharArray();
            int m = input1.length();
            int n = input2.length();

            System.out.println(lcs.lcs(X, Y, m, n));
        }

    }
}

