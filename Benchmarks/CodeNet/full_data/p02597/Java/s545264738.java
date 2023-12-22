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
//                int k=sc.nextInt();
//                if(k%2==0){
//                    System.out.println(-1);
//                }
//                else{
//                    long num=7;
//                    int flag=1,count=1;
//                    while(num%k!=0){
//                        if(num%k==0) {
//                            flag = 0;
//                            break;
//                        }
//                        else{
//                           String s=String.valueOf(num);
//                           s+="7";
//                           num=Long.parseLong(s);
//                           count++;
//                        }
//                        }
//                    System.out.println(count);
//
//                    }
//                }
            int n=sc.nextInt();
            String s=sc.next();
            int count1=0,count2=0;
            for(int j=0;j<n;j++){
                if(s.charAt(j)=='W'){
                    count1++;
                }
                else{
                    count2++;
                }
            }
            int cw=0,cr=0;
            for(int j=0;j<n/2;j++){
                if(s.charAt(j)=='W'){
                    cw++;
                }

            }
//            cr=count2-cr;
        for(int j=n-1;j>=n/2;j--){
            if(s.charAt(j)=='R'){
                cr++;
            }

        }
//        cw=count1-cw;
        System.out.println(Math.min(cr,cw));
    }

    }




