import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static void slove(long m[],int x){
        for(int i=0;i<3000;i++){
            for(int j=1;j<3000;j++){
                if(m[i]+m[j]==x){
                    System.out.print(i+" "+(-j));
                    return;
                }
                if(m[i]-m[j]==x){
                    System.out.print(i+" "+j);
                    return;
                }
            }
        }
    }
   /* public static StreamTokenizer in;
    static {
        try{
            in = new StreamTokenizer(new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in))));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int nextInt() throws IOException{ in.nextToken(); return (int)in.nval; }*/
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int x=sc.nextInt();
        long m[]=new long[3000];
        for(int i=0;i<m.length;i++)
            m[i]=(long)Math.pow(i,5);
        slove(m,x);



    }
}
