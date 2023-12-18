import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;


public class Main {
static String a;
static String b;

    public static void main(String[] args) {
        FastReader in = new FastReader();
        String s1 = in.next();
        String s2 = in.next();
        a = s1;
        b = s2;
        String table[][] = new String[3000][3000];
        boolean check[][] = new boolean[3000][3000];
        String rev_ans = go(s1.length()-1,s2.length()-1,"",table,check);
       // System.out.println(rev_ans);

        System.out.println(rev_ans);


    }

    static String go(int i,int j,String ans,String table[][],boolean check[][]){
        if(i==-1 || j==-1){
            return ans;
        }
        if(a.charAt(i)==b.charAt(j)){
            String temp = "";
            if(i>0 && j>0 &&!check[i-1][j-1]) {
                table[i-1][j-1] =  go(i - 1, j - 1, ans,table,check);
                check[i-1][j-1] = true;
                //System.out.println(table[i-1][j-1]);
                temp =  table[i-1][j-1];
            }else{
                if(i>0&&j>0)
                    temp  =  table[i-1][j-1];
                else {
                 // System.out.println(ans);
                    temp =  ans;
                }
            }
            return temp+a.charAt(i);


        }
        String temp1;
        String temp2;
        if((i-1)>=0 && !check[i-1][j]) {
            table[i-1][j] = go(i - 1, j, ans,table,check);
            temp1 = table[i-1][j];
            check[i-1][j] = true;
        }else{
            if(i!=0)
                temp1 =  table[i-1][j];
            else
                temp1 =  ans;
        }
        if((j-1)>=0 && !check[i][j-1]) {
            table[i][j-1] = go(i, j-1, ans,table,check);
            temp2 = table[i][j-1];
            check[i][j-1] = true;
        }else{
            if(j!=0)
                temp2 =  table[i][j-1];
            else
                temp2 =  ans;
        }
        //System.out.println(temp1+" "+temp2);


        if(temp1.length()>temp2.length()){
            return temp1;
        }else{
            return temp2;
        }
    }



    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}

