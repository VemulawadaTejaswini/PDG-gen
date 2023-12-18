

import java.util.Scanner;

public class Main {
    public static int[][] memo;
    public static String[][] smemo;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        memo = new int[s.length()+1][t.length()+1];
        smemo = new String[s.length()+1][t.length()+1];
        for(int i = 0; i <= s.length(); i++){
            for(int j = 0; j <= t.length(); j++){
                memo[i][j] = 0;
                smemo[i][j] = "";
            }
        }
        System.out.println(lcs(s,t,s.length(),t.length()));
    }

    public static String lcs(String s, String t, int i, int j){
        if(i<=0||j<=0) return "";
        if(!smemo[i][j].equals("")) return smemo[i][j];
        String res = "";
        if(s.charAt(i-1)==t.charAt(j-1)){
            res = lcs(s,t,i-1,j-1) + s.charAt(i-1);
//            res = 1 + lcs(s, t, i-1, j-1);
        }else{
            String a = lcs(s,t,i,j-1);
            String b = lcs(s,t,i-1,j);
            res = b;
            if(a.length()>b.length()){
                res = a;
            }
//            res = (int) Math.max(lcs(s,t,i,j-1), lcs(s,t,i-1,j));
        }
        smemo[i][j] = res;
        return res;
    }
}
