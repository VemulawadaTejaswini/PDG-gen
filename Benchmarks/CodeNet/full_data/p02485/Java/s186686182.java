import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	  public static void main(String[] args) {

	    String n;
	    int ans=0;
	  

	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	        
	        for(int i=0;i<1001;i++){
	        
		    n = reader.readLine();
	        String N = n.substring(i,i+1);
	        int num = new Integer(N).intValue();
	        ans+=num;
	        System.out.println(ans);
	        }
	        
	        System.out.println(ans);
	      }
	      catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	}