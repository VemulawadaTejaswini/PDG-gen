import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		boolean P=false,W=false,G=false,Y=false;
		String S=sc.next();;
		for(int i = 1; i < n; i++) {
			if(S.equals("P"))P=true;
			else if(S.equals("W"))W=true;
			else if(S.equals("G"))G=true;
			else if(S.equals("Y"))Y=true;
			}
		
		if(W && G && Y) {
			if(P)System.out.println("Four");
			else System.out.println("Three");
		 }
	 }
}