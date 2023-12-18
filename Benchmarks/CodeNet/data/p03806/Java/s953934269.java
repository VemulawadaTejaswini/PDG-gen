import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int [][] table = new int[401][401];
        int [][] item = new int[401][401];
        int n = in.nextInt();
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int [][][] shops = new int[n+1][401][401];
        for(int i=1;i<=n;i++){
            int ma = in.nextInt();
            int mb = in.nextInt();
            int cost = in.nextInt();
            for(int j =1;j<=400;j++){
                for(int k=1;k<=400;k++){
                    if(j==ma && k==mb){
                        if (shops[i-1][j][k]!=0){
                            shops[i][j][k] = Math.min(cost,shops[i-1][j][k]);
                        }
                        else {
                            shops[i][j][k] = cost;
                        }

                    }
                    else{
                        if(j>=ma && k>=mb ){
                            int pa = j-ma;
                            int pb = k-mb;
                            if(shops[i-1][pa][pb]!=0){
                                int c = cost+shops[i-1][pa][pb];
                                if(shops[i-1][j][k]!=0){
                                    shops[i][j][k] = Math.min(c,shops[i-1][j][k]);
                                }
                                else {
                                    shops[i][j][k]=c;
                                }

                            }
                        }
                        else {
                            shops[i][j][k]=shops[i-1][j][k];
                        }
                    }

                }
            }
        }
        int mn =401;
        int ma = m1;int mb=m2;
        while (ma<=400 && mb<=400){
            if (shops[n][ma][mb]!=0){
                mn = Math.min(mn,shops[n][ma][mb]);
            }
            ma+=m1;
            mb+=m2;
        }

        if(mn!=401){
            System.out.println(mn);
        }
        else {
            System.out.println(-1);
        }

    }
}
