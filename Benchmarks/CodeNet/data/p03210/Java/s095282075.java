import java.uitl.*;
import java.io.*;

public class Main{
  	public static void main(String[] args)throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      if(n==7 || n==5 || n==3)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
}