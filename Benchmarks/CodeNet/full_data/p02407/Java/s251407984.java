import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	     public static void main(String[] args) throws IOException {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            int n = Integer.parseInt(br.readLine());
	            int i;
	            String[] su=br.readLine().split(" ");
	                         
	            StringBuilder outArray = new StringBuilder();
	             
	            for( i=n-1;i>0;i--){
	            	System.out.print(su[i]+" ");
	            }
	            System.out.print(su[i]+"\n");
	    }
	}