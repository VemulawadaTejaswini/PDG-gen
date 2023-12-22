import java.io.*;  

public class Main {
    public static void main(String[] args) throws IOException {
	                                         
    	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf = br.readLine();
    ??????String[] x = buf.split(" ",0);
    	
    	int y = Integer.parseInt(x[0]);
    	int z = Integer.parseInt(x[1]);
    	if(y<z)
          System.out.println("y<z" ); 
    	else if(y>z)
          System.out.println("y>z" ); 
    	else if(y==z)
          System.out.println("y==z" ); 
	 ??? 
    }
    
}