import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	InputStream input = System.in;
      	OutputStream output = System.out;
      	Scanner sc = new Scanner(input);
      	PrintWriter out = new PrintWriter(output);
      	int X = sc.nextInt();
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	out.println((X - A) % B);
      	out.close();
    }
}