import java.util.Scanner;

public class Main{
    static String[][] res = new String[3001][3001];
    static String s, t;
    static int S,T;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if(s1.length() <= s2.length()){
            s = s1;
            t = s2;
        }else{
            s = s2;
            t = s1;
        }
        S = s.length();
        T = t.length();
        char[]x= s.toCharArray();
        char[]y = t.toCharArray();
        solve(x,y);


        String str;
        str=res[T][S];
        System.out.println(str);
    }
    private static void solve(char[] x, char[] y) {
        int m=T+1, n=S+1;
        for (int i = 0; i < m; i++) {
            res[i][0] = "";
        }
        for (int j = 0; j < n; j++) {
            res[0][j] = "";
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (y[i-1]==x[j-1]) {
                    res[i][j] = res[i][j-1]+x[j-1];
                }else if(res[i-1][j].length()>=res[i][j-1].length()){
                    res[i][j] = res[i-1][j];
                }else{
                    res[i][j] = res[i][j-1];
                }
            }
        }
    }
}