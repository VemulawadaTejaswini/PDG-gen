import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
class Main{
  public static void main(String[] args)throws IOException{
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
  
    String[] strAry = str.split(" ");
    int a = Integer.parseInt(strAry[0]);
  	int b = Integer.parseInt(strAry[1]);
  	int c = Integer.parseInt(strAry[2]);
  	
  	if ( a < b && b < c) {
  		System.out.println( "Yes");
  	}
  	else {
  		System.out.println( "No");
  	}
  	
  } 
}