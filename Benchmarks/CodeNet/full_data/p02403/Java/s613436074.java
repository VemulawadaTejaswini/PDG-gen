	import java.io.*;
	public class Main{
			  public static void main(String[]args){
			    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			    try{
		              String line1 = reader.readLine();
		              int H = Integer. parseInt(line1);
		              String line2 = reader.readLine();
		              int W = Integer. parseInt(line2);
		              for(int i = 0;i < H;++i) {
		            	  for(int j = 0;j < W;++j) {
		            		  System.out.printf("#");      		 
		            	  }
		            	  System.out.println("");
		            	  }
			          }
			    	
			    catch(IOException e) {
			    	
			    }
			  }
			}

