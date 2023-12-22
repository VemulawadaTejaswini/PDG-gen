import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m =sc.nextInt();
			int f =sc.nextInt();
			int r =sc.nextInt();
			if(m == -1 && f == -1 && r == -1) { break; }
			else if(m == -1 || f == -1) { ret("F"); }
			else if(m + f >= 80) { ret("A"); }
			else if(m + f >= 65) { ret("B"); }
			else if(m + f >= 50 ) { ret("C"); }
			else if(m + f >= 30) { 
				if(r >= 50) { ret("C"); }
				else { ret("D"); }
			} else { ret("F"); }
		}
		sc.close();
	}
	
	static void ret(String s) {
		System.out.println(s);
	}
}

