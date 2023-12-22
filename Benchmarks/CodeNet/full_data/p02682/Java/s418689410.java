import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {
	  Scanner in = new Scanner(System.in);
	  int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int k = in.nextInt();
      int sum = Math.min(a, k);
      if(a<k) {
    	  k-=a;
    	  if(b<k) {
    		  k-=b;
    		  sum -= k;
    	  }
      }
      System.out.print(sum);
  }
}