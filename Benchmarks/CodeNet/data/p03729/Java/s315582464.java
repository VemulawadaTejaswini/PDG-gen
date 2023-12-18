import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		if(isShiritori(a,b) && isShiritori(b,c)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();

	}
	
	public static boolean isShiritori(String a, String b) {
		return a.charAt(a.length()-1) == b.charAt(0);
	}

}

