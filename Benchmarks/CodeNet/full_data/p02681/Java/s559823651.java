import java.util.*;
public class Main{
	public static void main (String[] args){ 
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
      	String T = sc.next();
      	int numS = S.length();
      	int numT = T.length();
      	if(numT == numS+1){
          System.out.println("Yes");
        }
        else{
        System.out.println("No");
        }
    }
}