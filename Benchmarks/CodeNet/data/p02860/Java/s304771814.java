import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==0) {
			String t1 = "";
			String t2 = "";
			for(int i = 0; i< n;i++) {
				if(i < n/2) {
					t1 += sc.next();
				}else {
					t2 += sc.next();
				}
				
			}
			if(t1 == t2) {
				System.out.println("Yse");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No2");
		}
		

	}

}