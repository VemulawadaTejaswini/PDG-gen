import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  String[] sList = new String[N];
	  long count = 0;
	  for(int i=0; i<N; i++) {
		  String s = sc.next();
		  char[] c = s.toCharArray();
		  Arrays.sort(c);
		  String sorted = new String(c);
		  sList[i] = sorted;
		  for(int j=i-1; j>=0; j--) {
			  if (sList[i].equals(sList[j]))
				  count++;
		  }
	  }
	  

	  out.println(count);	  
  }
}