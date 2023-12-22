import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		long math[] = new long[A];
		for(int i =0; i<A;i++) {
			math[i] = sc.nextLong();
		}
		
		long goukei = 1;
		for(int i = 0; i<A;i++) {
			goukei = goukei * math[i];
		}
		long check = 1000000000000000000L;
		if(goukei >check) {
			System.out.println("-1");
		}
		else {
			System.out.println(goukei);
		}
		
		
		

	}

}
