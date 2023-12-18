import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt(); //問題数
	  int M = sc.nextInt(); //解答した回数
	  int ACcount=0;
	  int WAcount = 0;
	  Set<Integer> corrected = new HashSet<>(); //既に正解した問題番号
	  int[] WA = new int[N+10];
	  for(int i=0; i<M; i++) {
		  int p = sc.nextInt();
		  String s = sc.next();
		  
		  if(corrected.contains(p)) 
			  continue;
		  if( s.equals("AC")) {
			  ACcount++;
			  corrected.add(p);
			  WAcount += WA[p];
		  } else if (s.equals("WA")) {
			  WA[p]++;
		  }
	  }
	  
	  out.println(ACcount + " " + WAcount);
	  
	}
  }	