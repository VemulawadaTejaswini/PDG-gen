import java.io.*;
public class Main{
   public static void main(String[] args) throws IOException{
	   BufferedReader buf = new BufferedReader(new InputStreamReader (System.in));
	   String s = buf.readLine();
	   int i = Integer.parseInt(s);
	   System.out.println(i*i*i);
   }
}