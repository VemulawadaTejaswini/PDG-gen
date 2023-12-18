
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import  java.io.*;
import  java.math.*;
import java.nio.Buffer;
import java.sql.SQLSyntaxErrorException;
import  java.util.*;
import  java.text.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    static class kNight implements Comparable<kNight>{
        int p;
        int c;
        kNight(int p,int c){
            this.p=p;
            this.c=c;
        }
        @Override
        public int compareTo(kNight k) {
            if(p==k.p){
                return c-k.c;
            }
            else{
                return p-k.p;
            }
        }


    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader cin=new FastReader();
        int n=cin.nextInt();
        char s[]=cin.next().toCharArray();
        long sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(s[i]!=s[j]&&s[i]!=s[k]&&s[j]!=s[k]&&j-i!=k-j){
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);

    }
}
