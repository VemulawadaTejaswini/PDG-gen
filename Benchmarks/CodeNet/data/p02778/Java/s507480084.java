import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int a = S.length();
		StringBuilder B = new StringBuilder();
		
		for(int i=0; i<a; i++) {
			B.append("×");
		}
		System.out.println(B);
	}
	}