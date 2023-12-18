import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=sc.nextInt();
		String s = sc.next();
		boolean hasHyphen=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='-') {
				if(hasHyphen) {
					System.out.println("No");
				}else {
					hasHyphen=true;
				}
			}
		}if(hasHyphen) {
		System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
