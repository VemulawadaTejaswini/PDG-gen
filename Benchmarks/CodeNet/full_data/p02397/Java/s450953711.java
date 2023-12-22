import java.io.IOException;
import java.io.InputStreamReader;
import java.io.* ;
 
class Main{
  public static void main(String[] args)throws IOException{
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\?????????
    String str = br.readLine();
  
    String[] strAry = str.split(" ");
    int a = Integer.parseInt(strAry[0]);
  	int b = Integer.parseInt(strAry[1]);
  	int c;
  	while ( a!=0 || b!=0 ) {  
  		if (a < b) {}
  			
  		else if ( a> b) {c= a; a= b; b= c;
  		}
  		System.out.println( a + " " + b);
  	     str = br.readLine();
 		 strAry = str.split(" ");
         a = Integer.parseInt(strAry[0]);
         b = Integer.parseInt(strAry[1]);
  	}
  	}	
  		
  	}
  