package sairi.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	  public static void main(String[] args) {
	    String line;
	    int n;

	  

	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	        line = reader.readLine();
	        n = Integer.parseInt(line);
	        System.out.println(n*n*n);
	    }
	      catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	}