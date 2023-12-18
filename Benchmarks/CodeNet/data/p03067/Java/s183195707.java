import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
      	int A,B,C;
      	A = sc.nextInt();
      	B = sc.nextInt();
      	C = sc.nextInt();
      	if ((A + B / 2) > C) {
            	System.out.print("Yes");
        }  else {
        	System.out.print("No");
        }   
    }
}