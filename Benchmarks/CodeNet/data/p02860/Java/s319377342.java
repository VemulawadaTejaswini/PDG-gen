
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		Echo(n,s);
	}
	
	static void Echo(int n, String s) {
		String mae=s.substring(0,n/2);
		String usiro=s.substring(n/2,n);
		if(mae.equals(usiro)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}		
	}
}
