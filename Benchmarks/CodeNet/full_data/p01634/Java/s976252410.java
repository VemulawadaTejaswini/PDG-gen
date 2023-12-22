import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = s.length();
		if(l<6) {
			System.out.println("INVALID");
			return;
		}
		char[] p = new char[l];
		for(int i=0;i<l;i++) {
			p[i] = s.charAt(i);
		}
		boolean num = false;
		boolean cap = false;
		boolean lit = false;
		for(int i=0;i<l;i++) {
			char c = p[i];
			if('0'<=c && c<='9') num = true;
			if('A'<=c && c<='Z') cap = true;
			if('a'<=c && c<='z') lit = true;
		}
		if(num && cap && lit) {
			System.out.println("VALID");
		}else {
			System.out.println("INVALID");
		}
		
	}	
}



