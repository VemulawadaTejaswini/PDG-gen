import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(st==null || !st.hasMoreElements()){
                try{
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }

        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try{
                str=br.readLine();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
    static String st(long sum,int a[],int m,int n){
        int b= (int) (sum/(4*m));
        if(sum%4!=0){
            b+=1;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]>=b){
                count++;
            }
        }
        if(count>=m){
           return "Yes";
        }else{
            return "No";
        }
    }
    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n=in.nextInt();
        int m=in.nextInt();
        int sum=0;
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            sum+=a[i];
        }
        System.out.println(st(sum,a,m,n));

    }
}

