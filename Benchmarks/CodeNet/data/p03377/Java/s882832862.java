import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
      	int B = scan.nextInt();
      	int X = scan.nextInt();
      	if(X - A < 0 || X - A > B){
        	System.out.print("NO");
        }
      	else{
        	System.out.print("YES");
        }
    }
 
}