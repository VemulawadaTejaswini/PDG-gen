import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			char[] c = s.toCharArray();
			if(c[0] == c[1] && c[1] == c[2] && c[0] != 's') {
				if(c[0] == 'o') {
					System.out.println("o");
				}else {
					System.out.println("x");
				}
			}else if(c[3] == c[4] && c[4] == c[5] && c[3] != 's') {
				if(c[3] == 'o') {
					System.out.println("o");
				}else {
					System.out.println("x");
				}
			}else if(c[6] == c[7] && c[7] == c[8] && c[6] != 's') {
				if(c[6] == 'o') {
					System.out.println("o");
				}else {
					System.out.println("x");
				}
			}else if(c[0] == c[3] && c[3] == c[6] && c[0] != 's') {
				if(c[0] == 'o') {
					System.out.println("o");
				}else {
					System.out.println("x");
				}
			}else if(c[1] == c[4] && c[4] == c[7] && c[1] != 's') {
				if(c[1] == 'o') {
					System.out.println("o");
				}else {
					System.out.println("x");
				}
			}else if(c[2] == c[5] && c[5] == c[8] && c[2] != 's') {
				if(c[2] == 'o') {
					System.out.println("o");
				}else {
					System.out.println("x");
				}
			}else if(c[0] == c[4] && c[4] == c[8] && c[0] != 's') {
				if(c[0] == 'o') {
					System.out.println("o");
				}else {
					System.out.println("x");
				}
			}else if(c[2] == c[4] && c[4] == c[6] && c[2] != 's') {
				if(c[2] == 'o') {
					System.out.println("o");
				}else {
					System.out.println("x");
				}
			}else {
				System.out.println("d");
			}
		}
		sc.close();
	}
}
