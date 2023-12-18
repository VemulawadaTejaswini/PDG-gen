import java.io.*;

 
public class Main {
	  public static void main(String args[])throws IOException
             {
		BufferedReader br =    
		    new BufferedReader(new InputStreamReader(System.in));
          
		    String str1 = br.readLine();
		    int N = Integer.parseInt(str1);
		    
		    	int sum = 0;
		    	
		    do {	sum += N % 10;
		    } while((N/= 10)!= 0);
		    	System.out.println(sum);
		    
		    }
        
		    
        	
             }
           