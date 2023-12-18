import java.io.*;

public class Main {
	  public static void main(String args[])throws IOException
	  {
		  BufferedReader br = 
				  new BufferedReader(new InputStreamReader(System.in));
		  String str1 = br.readLine();
		  String str2 = br.readLine();
		  
		  int A = Integer.parseInt(str1);
		  int B = Integer.parseInt(str2);
		  int C = A*B;
		  
		  if(C%2==0)
		  {
			  System.out.println("Even");
		  }
		  else 
		  {
			  System.out.println("Odd");  
		  }
	  }
        	
        	
        }
