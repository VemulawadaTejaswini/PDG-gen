import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{


			  String ab;
			  String[] strAry;
			  int a;
			  int b;


			  while(true){
			      ab = input.readLine();
		          strAry = ab.split(" ");
		          a=Integer.parseInt(strAry[0]);
	              b=Integer.parseInt(strAry[1]);

	              if(a==0&&b==0){
	        	      break;
	               }
	                  for(int i=0; i<a; i++){

	        	          for(int j=0; j<b-1; j++){
	        		          System.out.print('#');
	        		     
	        	          }
	        	          System.out.println('#');
                          //println??§?????????????????????????????¨???????????????
	                  }

	                  System.out.println("");
	              }



		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }

	}
}