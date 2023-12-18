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
      	int X = Integer.parseInt(sc.next());
      	int A = Integer.parseInt(sc.next());
      	int B = Integer.parseInt(sc.next());
    	if(0 < A - B){
        	out.println("delicious");
        }else if(Math.abs(A - B) <= X){
        	out.println("safe");
        }else{
        	out.println("dangerous");
        }
   		out.close();
    }
}