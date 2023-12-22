import java.util.*;

public class eof {
	 public static void main(String[] args) {

	  Scanner s = new Scanner(System.in);

	  int r = s.nextInt();
	  int g = s.nextInt();
	  int b = s.nextInt();
	  int k = s.nextInt();
	  
	  int temp = k;
	  int count = 0;
	  
	  while(temp != 0) {
		  
		  if(r<b && r<g) {
			  r *= 2;
			  count++;
		  }
		  else if(g<b && g<r) {
			  g *=2;
			  count++;
		  }
		  else if(b<r && b<g){
			  b *= 2;
			  count++;
		  }
		  temp--;
	  }
	  s.close();
	  

	  if(count == k) {
		  System.out.println("Yes");
	  }
	  else {
		  System.out.println("No");
	  }
	  
	 }
}