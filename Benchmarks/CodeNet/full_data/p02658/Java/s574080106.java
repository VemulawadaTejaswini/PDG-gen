
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        long pro=1;
        StringTokenizer st=new StringTokenizer(in.readLine());
        for(int i=0;i<n;i++){
            long x=Long.parseLong(st.nextToken());
            pro*=x;
        }
        long o=(long)(Math.pow(10,18));
        if(pro>o || pro<0)
            System.out.println("-1");
        else
            System.out.println(pro);
    }
}
