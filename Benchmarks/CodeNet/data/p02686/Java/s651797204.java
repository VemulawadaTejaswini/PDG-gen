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
	  int n = in.nextInt();
	  int left = 0, right = 0;
	  in.nextLine();
	  for(int i=0; i<n; i++) {
		  String s = in.nextLine();
		  int thisleft = 0;
		  int thisright = 0;
		  for(char c: s.toCharArray()) {
			  if(c=='(') {
				  if(thisleft>=0) thisleft++;
				  else thisright--;
			  }
			  else{
				  if(thisleft<=0) thisleft--;
				  else if(thisleft>0 && thisright<0) thisright++;
				  else if (thisleft>0) thisleft--;
			  }
		  }
		  //System.out.println("thisleft:"+thisleft+",thisright:"+thisright);
		  left+=thisleft;
		  right+=thisright;
	  }
	  if(left>=0 && right>=0 && left==right) System.out.println("Yes");
	  else System.out.println("No");

      
  }
}