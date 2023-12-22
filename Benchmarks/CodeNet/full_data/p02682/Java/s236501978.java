import java.io.*;
        import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        int v=a%b;
        return gcd(b,v);
    }
    public static StreamTokenizer in;
    static {
        try{
            in = new StreamTokenizer(new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in))));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int nextInt() throws IOException{ in.nextToken(); return (int)in.nval; }
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=nextInt();
        int b=nextInt();
        int c=nextInt();
        int k=nextInt();
        long all=0;
        while(k>0){
            if(a<k){
                k-=a;
                all+=a;
            }else{
                k=0;
                all+=k;
            }
            if(b<k){
                k-=b;
            }else k=0;
            all-=k;
        }
        System.out.print(all);
    }
}
