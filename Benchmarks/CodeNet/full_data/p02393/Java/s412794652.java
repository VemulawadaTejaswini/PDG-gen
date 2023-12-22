import java.io.*;
import java.util.*;
 
public class Main{
  public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String[] spl=s.split(" ");
        int a=Integer.parseInt(spl[0]);
        int b=Integer.parseInt(spl[1]);
        int c=Integer.parseInt(spl[2]);
 
 		Arrays.sort(spl);
 		System.out.println(spl[0]+" "+spl[1]+" "+spl[2]);
 
    }
}