///*Radhe Krishna*/
import javax.management.DynamicMBean;
import javax.print.DocFlavor;
import javax.print.attribute.HashAttributeSet;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.CookieHandler;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;
import java.util.concurrent.Callable;



public class Main {
    static int mod = 1000000007;

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
//        Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                        double     d=sc.nextDouble();

                int count=0;
                for(int j=0;j<n;j++){
                    int x=sc.nextInt();
                    int y=sc.nextInt();
                    x=Math.abs(x);
                    y=Math.abs(y);
                    double dis=(double)Math.sqrt((double)((long)x*x)+(double)((long)y*y));
                    if(dis<=(double)d){
                        count++;
                    }

                }
                System.out.println(count);

    }
}



