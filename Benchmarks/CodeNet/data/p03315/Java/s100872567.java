import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		String str = sc.next();
		
		for(int i = 0; i < 4; i++) {
			if(str.charAt(i) == '+')		n++;
			else	n--;
		}
		
		System.out.println(n);

	}

}
