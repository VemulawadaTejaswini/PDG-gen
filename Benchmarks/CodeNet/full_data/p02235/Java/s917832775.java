import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.io.*;
//import java.util.stream.IntStream;



public class Main {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //try{}
        
        int n = Integer.parseInt(sc.nextLine());
        String ans = "";

        for(int i=0;i<n;i++){
            String x = sc.nextLine();
            String y = sc.nextLine();

            int xl = x.length();
            int yl = y.length();

            int[][] c = new int[xl + 1][yl + 1];


            int l = lcs(x,y,c);

            ans += Integer.toString(l) + '\n';
        }

        System.out.print(ans);


    }

    public static int lcs(String x, String y, int[][] c){
        int xl = x.length();
        int yl = y.length();

        for(int i=1;i<=xl;i++){
            for(int j=1;j<=yl;j++){
                if(x.charAt(i-1) == y.charAt(j-1)){
                    c[i][j] = c[i-1][j-1] + 1;
                } else {
                    c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
                }
            }
        }

        return c[xl][yl];

    }

}



