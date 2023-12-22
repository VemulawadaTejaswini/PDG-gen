import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException{
	   BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	   String s,c;
	   while(true){
		   s = buf.readLine();
		   if(s == null) break;
		   c = buf.readLine();
		   int total = Integer.parseInt(s) + Integer.parseInt(c);
		   System.out.println(Integer.toString(total).length());
	   }
   }
}