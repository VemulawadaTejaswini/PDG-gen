import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String Sk[] = S.split("");
	
	String A = Sk[0];
	String B;
	int cnt = 0;
	
	int i=1;
	while(i<S.length()){
      B = Sk[i];
      if(A.equals(B)){
        B = B + Sk[i+1];
        i++;
	  }
	  A = B;
	  
	  cnt++;
	  i++;
	} 
	
	cnt++;
    System.out.println(cnt);
  }
}