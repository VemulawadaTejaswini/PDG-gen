import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	InputStream inputStream = System.in;
    	OutputStream outputStream = System.out;
    	Scanner sc = new Scanner(inputStream);
    	PrintWriter out = new PrintWriter(outputStream);
      	String N = sc.next();
      	if(N.charAt(0) == N.charAt(2)){
          	out.print("Yes");
        }else{
        	out.print("No");
        }
    	out.close();
    }
}