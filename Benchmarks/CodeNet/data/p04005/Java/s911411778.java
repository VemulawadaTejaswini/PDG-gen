import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        if(a%2==0||b%2==0||c%2==0) System.out.println(0);
        else{
            int sum1=a*b;
            int sum2=b*c;
            int sum3=a*c;
            System.out.println(Math.min(Math.min(sum1, sum2), sum3));
        }
    }
    
}