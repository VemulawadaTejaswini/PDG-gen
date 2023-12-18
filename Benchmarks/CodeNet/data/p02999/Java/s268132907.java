import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String[] args) throws Exception{
    	
      	InputStream inputStream = System.in;
      	OutputStream outputStream = System.out;
      	InputReader in = new InputReader(inputStream);
      	PrintWriter out = new PrintWriter(outputStream);
      	Task solver = new Task();
      	solver.solve(in,out);
		out.close();
      
    }
  
  	static class Task{
    	public void solve(InputReader in , PrintWriter out){
        	
          	int x = in.nextInt();
          	int a = in.nextInt();
          
          
          	if(x < a)
              	out.println("0");
          	else 
              	out.println("10");
          
        }
    }
  	
  	static class InputReader{
    	
      	BufferedReader reader;
      	StringTokenizer tokenizer;
      
      	public InputReader(InputStream inputStream){
        	reader = new BufferedReader(new InputStreamReader(inputStream));
          	tokenizer = null;
        }
      
      	public String next(){
        	while(tokenizer == null || !tokenizer.hasMoreTokens()){
            	try{
                	tokenizer = new StringTokenizer(reader.readLine());
                }
              	catch(IOException e){
                	throw new RuntimeException(e);
                }
            }
          return tokenizer.nextToken();
        }
      
      public int nextInt(){
      	return Integer.parseInt(next());
      }
    }
}