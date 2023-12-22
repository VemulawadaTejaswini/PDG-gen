
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {//change to Main
    static int INF = Integer.MAX_VALUE;
    static int[][] near = {{0,0,1,-1},{1,-1,0,0}};
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//
    static StringTokenizer st;
    static StringBuilder sb;
    static String line;


    public static void main(String[] args) throws Exception {

        //int T = Integer.parseInt(in.readLine());//number of messages
        int T =1;
        for (int t = 0; t < T; t++) {
            solve();
            //st = new StringTokenizer(in.readLine());
            //int x = Integer.parseInt(st.nextToken());

        }//forLoop#1
    }//main


    public static void solve() throws Exception{
        int w,n;
        w= Integer.parseInt(in.readLine());
        n= Integer.parseInt(in.readLine());

        int[] A = new int[w]; //array
        for (int i = 0; i < w; i++) {
            A[i] = i+1;
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine(),",");
            int a,b,temp;
            a = Integer.parseInt(st.nextToken())-1;
            b = Integer.parseInt(st.nextToken())-1;
            temp = A[a];
            A[a] = A[b];
            A[b] = temp;
        }

        for (int i = 0; i < w; i++) {
            System.out.println(A[i]);
        }



    }
}//class