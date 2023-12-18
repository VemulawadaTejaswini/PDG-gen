import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int[] H = new int[N];
	  boolean isTrue = true;
	  
	  if(N == 1)
		  out.println("Yes");
	  else {
		  H[0] = sc.nextInt();
		  int max = H[0];
		  for(int i=1; i<N; i++) {
			  H[i] = sc.nextInt();
			  if(H[i] > H[i-1]) {
				  max = H[i];
			  }
			  if( H[i] + 1 < max) {
				  isTrue = false;
				  break;
			  }
		  }

		  if (isTrue) out.println("Yes");
		  else out.println("No");
	  }
  	}
  }	  