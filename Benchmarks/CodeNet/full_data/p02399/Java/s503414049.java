import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = buf.readLine();
    	String[] strlAry =s.split(" ");
    	for(int i=0;i<strlAry.length;i++){
   	    }
   	    double a = Integer.parseInt(strlAry[0]);
   	    double b = Integer.parseInt(strlAry[1]);

   	    double d = a/b;
   	    double r = a%b;
   	    double f = a/b;
   	    String f2 = String.format("%.5f", f);
   	    System.out.println((int)d+" "+(int)r+" "+f2);
 	}
}