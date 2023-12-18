import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int A=N/500;
        int ans=A*1000;
        A=(N%500)/5;
        ans+=5*A;
        System.out.println(ans);
    }
}