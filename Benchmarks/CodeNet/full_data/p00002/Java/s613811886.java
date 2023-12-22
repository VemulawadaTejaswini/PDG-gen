//Digit Number
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		  Scanner scan = new Scanner(System.in);

		  while(scan.hasNext()){
		  
			    String[] ab = scan.next().split(" ");

			    int a = Integer.parseInt(ab[0]);
			    int b = Integer.parseInt(ab[1]);
		  
			    System.out.println(Integer.toString(a+b).length());
			    
		  }
		
	}
}