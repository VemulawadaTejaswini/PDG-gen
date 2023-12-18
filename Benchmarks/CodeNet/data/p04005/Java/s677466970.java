import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        long a=Integer.parseInt(st.nextToken());
        long b=Integer.parseInt(st.nextToken());
        long c=Integer.parseInt(st.nextToken());
        if(a%2==0 || b%2==0 || c%2==0){ System.out.println(0); }
        else{
            System.out.println(Math.min(a*b,Math.min(a*c, b*c)));
        }
    }
}