import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B(sc);
	}
	
	public static void A(Scanner sc) {
		int n = sc.nextInt();
		int k = sc.nextInt()-1;
		String s = sc.next();
		System.out.println(s.substring(0,k)+Character.toLowerCase(s.charAt(k))+s.substring(k+1,n));
	}
	
	public static void B(Scanner sc) {
		String s = sc.next();
		if(Integer.valueOf(s.substring(0,2))>=13 && Integer.valueOf(s.substring(2,4))<=12 && Integer.valueOf(s.substring(2,4))>=1) System.out.println("YYMM");
		else if(Integer.valueOf(s.substring(2,4))>=13 && Integer.valueOf(s.substring(0,2))<=12 && Integer.valueOf(s.substring(0,2))>=1) System.out.println("MMYY");
		else if(Integer.valueOf(s.substring(2,4))<=12 && Integer.valueOf(s.substring(0,2))<=12 && Integer.valueOf(s.substring(2,4))>=1 && Integer.valueOf(s.substring(0,2))>=1) System.out.println("AMBIGUOUS");
		else System.out.println("NA");
	}
}
