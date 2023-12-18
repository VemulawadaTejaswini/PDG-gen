import java.util.*;
import java.io.*;
import java.lang.*;

 class Main{
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder("");
    static StringTokenizer stk = new StringTokenizer("");

    public static void main(String args[]){
        try{
            String s = bf.readLine();
            String t = bf.readLine();
            solver(s,t);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void solver(String s, String t){
        int[][] dp = new int[s.length()][t.length()];

        for(int i=0;i<s.length();i++){ //for string s
            for(int j=0;j<t.length();j++){//for string t
                
                if(s.charAt(i) == t.charAt(j)){
                    dp[i][j] = 1 + ((i-1 >= 0 && j-1 >= 0) ? dp[i-1][j-1] : 0);
                }else{
                    dp[i][j] = Math.max((i-1 >= 0 ? dp[i-1][j] : 0),(j-1 >= 0 ? dp[i][j-1] : 0));
                }
                
            }
        }
        int slen = s.length()-1;
        int tlen = t.length()-1;

        StringBuilder sb  = new StringBuilder("");
        
        while(slen >= 0 && tlen >= 0){

            if((slen >= 0 && tlen >= 0) && s.charAt(slen) == t.charAt(tlen)){
                sb.append(s.charAt(slen));
                slen--;
                tlen--;
            }else{
                if(slen-1 >= 0 && tlen-1 >= 0){
                    if(dp[slen-1][tlen] > dp[slen][tlen-1] ){
                        slen--;
                    }else{
                        tlen--;
                    }
                }else if(slen-1 >= 0 && tlen-1 < 0){
                    slen --;
                }else if(slen-1 < 0 && tlen-1 >= 0){
                    tlen --;
                }
            }
        }

        // printDpTable(dp);
        // System.out.println(dp[s.length()-1][t.length()-1]);
        System.out.println(sb.reverse().toString());
    }

    public static void printDpTable(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println("");
        }
    }
}