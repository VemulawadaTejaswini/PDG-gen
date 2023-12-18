import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String [] s = new String[n];
		boolean hantei = true;
		for(int i=0;i<n;i++) {
			s[i]=scan.next();
			if(s[i].equals("Y")) {
				hantei = false;
			}
		}
		if(hantei ==true) {
			System.out.println("Three");
		}else {
			System.out.println("Four");
		}
	}

}
