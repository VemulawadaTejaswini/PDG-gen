import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException{
	   BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	   String str;
	   StringBuffer s = new StringBuffer("");
	   str = buf.readLine();
	   s.append(str);
	   s.reverse();
	   System.out.println(s);
   }
}