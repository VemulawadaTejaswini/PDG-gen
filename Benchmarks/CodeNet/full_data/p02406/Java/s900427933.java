import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{
			
			     String ab = input.readLine();
		         String []strAry = ab.split(" ");
		         int  a=Integer.parseInt(strAry[0]);
		         int count=1;
		         int d=0;
		        
		         for(int i=0; i<a; i++){
		        	

		        	 if(count%3==0){
		        		 System.out.print(" "+count);
		        	 }else{
		        		
		        		 int x=count;
		        		
		        		 while(x!=0){
		        			if(x%10==3){
		        				System.out.print(" "+count);
		        				break;
		        			}else{
		        				x=x/10;
		        				}

		        		 }
		        	 }



		        	 count++;

		         }


		    }catch(IOException e) {System.out.println("Exception : " + e);
		    }

	}
}