import java.util.*;
import java.io.*;
public class Main {
    static int h,w;
    static char[][] s;
    static int[][] d;
    static int[] dr={0,-1,0,1};
    static int[] dc={-1,0,1,0};
    public static void main(String[] $) {
        h=sc.nextInt();
        w=sc.nextInt();
        s=new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i]=sc.next().toCharArray();
        }
        d=new int[h][w];
        int black=0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                d[i][j]=Integer.MAX_VALUE;
                if(s[i][j]=='#'){
                    black++;
                }
            }
        }
        dfs(1,0,0);
        int ans;
        if(d[h-1][w-1]==Integer.MAX_VALUE){
            ans=-1;
        }else {
            ans=h*w-d[h-1][w-1]-black;
        }
        out.println(ans);
        out.close();
    }

    static void dfs(int count,int row,int column){
        if(!(0<=row&&row<h&&0<=column&&column<w))return;
        if(s[row][column]=='#')return;
        if(count>d[row][column])return;
        if(count<=d[row][column])d[row][column]=count;
        for (int i = 0; i < 4; i++) {
            dfs(count+1,row+dr[i],column+dc[i]);
        }
    }
    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }

        static boolean hasNext() {
            return s.hasNext();
        }
    }
}