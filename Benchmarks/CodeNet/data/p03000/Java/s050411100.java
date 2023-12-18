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
        	
          	int n = in.nextInt();
          	int x = in.nextInt();
          
          	int[] steps = new int[n];
          	for(int i = 0;i<n;i++)
              steps[i] = in.nextInt();
          
          	int result = 0;
          	int d = 0;
          	for(int i = 0;i<n && d <= x;i++)
            {
            	++result;
              	d += steps[i];
            }
          
          	out.println(result);
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