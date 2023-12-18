import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    /*public static StreamTokenizer in;
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=b/a*a;
        if(b%a!=0)
            d+=a;
        if(c>=d)
            System.out.println("OK");
        else System.out.println("NG");
    }
}
