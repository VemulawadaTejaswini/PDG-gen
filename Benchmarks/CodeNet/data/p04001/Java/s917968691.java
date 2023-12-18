import java.io.*;
import java.util.*;
public class Main {
    static long sum;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sum += Long.valueOf(s);
        
        int plusNum = s.length() - 1;
        for(int i = 1; i <= plusNum; i++)
            dfs(s, i, 0, 0);
            
        System.out.println(sum);
    }
    
    private static void dfs(String s, int plusNum, int idx, long curSum) {
        if(plusNum == 0) {
            sum += Long.valueOf(s.substring(idx)) + curSum;
            return;
        }
        for(int i = idx; i < s.length() - plusNum; i++) {
            dfs(s, plusNum - 1, i + 1, curSum + Long.valueOf(s.substring(idx, i + 1)));
        }
    }
}