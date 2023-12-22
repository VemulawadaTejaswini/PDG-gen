import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;



public class Main{
	  public static void main(String[] args) {
	    String line;

	  

	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	        line = reader.readLine();
	        BigDecimal n = new BigDecimal ("Integer.parseInt(line)");
	        BigDecimal Pi= new BigDecimal("Math.PI");
	        BigDecimal area = new BigDecimal("n*n*Pi");
	        BigDecimal length = new BigDecimal("2*n*Pi");
	        System.out.printf("%f %f",area,length);
	    }
	      catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	}