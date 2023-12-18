import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new java.util.Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		String str1 ="";
		String str2 = "";
		if(n%2==0) {
			for(int i=1;i < n/2;i++) {
				str1 =str1 + str.charAt(i);
				str2 =str2 + str.charAt((n/2)+i);
			}
			if(str1.equals(str2)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		else {
			System.out.println("No");
		}
	}

}