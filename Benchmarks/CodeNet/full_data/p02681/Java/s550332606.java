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
        String a=sc.nextLine();
        String b=sc.nextLine();
        b=b.substring(0,b.length()-1);
        if(a.equals(b))
            System.out.print("Yes");
        else System.out.print("No");
    }
}
