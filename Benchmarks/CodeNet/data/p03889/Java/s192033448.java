import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int n = S.length();
		int n2 = 0;
		int n3 = (S.length() - 1);
		if(n % 2 == 1) {
			System.out.println("No");
			System.exit(0);
		}
		while(n3 - n2 >= 0){
			int ch1 = (int)(S.charAt(n2));
			int ch2 = (int)(S.charAt(n3));
			int ch3 = ch1 - ch2;
			if(ch3 == 2 || ch3 == -2 || ch3 == 1 || ch3 == -1){
				n2++;
				n3--;
				if(n3 - n2 == 1 && ch3 == 2 || ch3 == -2 || ch3 == 1 || ch3 == -1){
					System.out.println("Yes");
					break;
			}
			}else{
				System.out.println("No");
				break;
			}
		}
	}
}
