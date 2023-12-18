import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
      	boolean Current=true;
 		
		for(int i=0; i<str.length(); i++){
			if(i%2==1)
            {
              if (str.charAt(i)=='R')
              {
                Current=false;
              }
            }
          	else
            {
              if (str.charAt(i)=='L')
              {
                Current=false;
              }
            }
		}
      	if (Current==true){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
	}
}