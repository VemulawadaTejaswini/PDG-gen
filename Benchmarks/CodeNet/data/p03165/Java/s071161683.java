
import java.io.*;
import java.util.*;
class Main {
    static int check;
    public static void main (String[] args) {
        //System.out.println("GfG!");
        int n;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int m = s.length();
         n = t.length();
        int dp[][]=new int[s.length()+1][t.length()+1];
        String ans[][] = new String[s.length()+1][t.length()+1];
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    ans[i][j] = "";
                else if (s.charAt(i-1) == t.charAt(j-1))
                    ans[i][j] = ans[i-1][j-1] + s.charAt(i-1);
                else
                    ans[i][j] = maxOfTwo(ans[i-1][j], ans[i][j-1]);
            }
        }
        System.out.println(ans[s.length()][t.length()]);
    }
    private  static String maxOfTwo(String s1,String s2){
        if(s1.length()>=s2.length())
            return s1;
        else
            return s2;
    }
}