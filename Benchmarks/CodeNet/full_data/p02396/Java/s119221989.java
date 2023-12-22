import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while(true){
    try{
          String line = reader.readLine();
          b = Integer.parseInt(line);
          a++;
          if (b == 0) break;
          System.out.println("Case " + a + ": " + b);
		}catch(Exception e){
      break;
    }
  }

	}
}
