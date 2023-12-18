import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
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
        int n=nextInt();
        int m=nextInt();
        int high[]=new int[n+1];
        int count[]=new int[n+1];
        for(int i=1;i<=n;i++)
            high[i]=nextInt();
        for(int i=0;i<m;i++){
            int p=nextInt();
            int q=nextInt();
            int x=high[p];
            int y=high[q];
            if(x==y){
                count[p]--;
                count[q]--;
            }else if(x<y)
                count[p]--;
            else count[q]--;
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(count[i]==0)
                ans++;
        }
        System.out.println(ans);


    }
}
