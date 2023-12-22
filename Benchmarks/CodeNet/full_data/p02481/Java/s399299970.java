import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	  public static void main(String[] args) {
	    String line;
	    int n,m;

	  

	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	        line = reader.readLine();
	        n = Integer.parseInt(line);
	        line = reader.readLine();
	        m = Integer.parseInt(line);
	        System.out.println(n*m+" "+(n+m)*2);
	    }
	      catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	}