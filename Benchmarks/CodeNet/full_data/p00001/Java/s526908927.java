import java.io.*;

public class Main{

	static int first = 0;
	static int second = 0;
	static int third = 0;
	static int tmp = 0;
	
	public static void main(String[] args) {
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         try{
        	 String buf = br.readLine();
        	 tmp = Integer.parseInt(buf);
        	 while(isr != null){
        	 	 if(first < tmp){
        	 		 first = tmp;
        	 		 second = first;
        	 	 }else if(second < tmp){
        	 		 second = tmp;
        	 		 third = second;
        	 	 }else if(third < tmp){
        	 		 third = tmp;
        	 	 }
        	 }    	 
         }catch(Exception e){
        	
         }        
         System.out.println(first+"\n"+second+"\n"+third);
	}
	
}