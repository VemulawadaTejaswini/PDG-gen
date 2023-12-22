import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{


			  String ab;
              
			  double r;
			  
			  double pi=3.141592653589;
			 

			  
			  ab = input.readLine();
		      r= Double.parseDouble(ab);



			  System.out.println(r*r*pi+" "+2*pi*r);


		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }

	}
}