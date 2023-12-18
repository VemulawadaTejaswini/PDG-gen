
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int n = 0;
		int s = 0;
		int e = 0;
		int w = 0;

		for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'N'){
				n = 1;
			}else if (S.charAt(i) == 'S'){
				s = 1;
			}else if (S.charAt(i) == 'E'){
				e = 1;
			}else if (S.charAt(i) == 'W'){
				w = 1;
			}
		}

		if (n ==1 && s == 1 && e == 1 && w == 1)
			System.out.println("Yes");
		else if (n ==1 && s == 1 && e == 0 && w == 0)
			System.out.println("Yes");
		else if  (n ==0 && s == 0 && e == 1 && w == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}

}
