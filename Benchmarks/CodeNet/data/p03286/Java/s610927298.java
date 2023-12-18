//https://atcoder.jp/contests/abc105/tasks/abc105_c

import java.io.*;
import java.util.ArrayList;

class Main{
    ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long N = Long.parseLong(str);
        StringBuffer ans = new StringBuffer();
        while (N!=0){
            if (N%2==0){
                ans.insert(0, "0");
            } else {
                N--;
                ans.insert(0, "1");
            }
            N /= -2;
        }
        if (ans.length()==0){
            ans.append("0");
        }
        System.out.println(ans);
    }
}