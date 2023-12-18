import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		boolean hantei =false;

		for(int i=0;i<=a;i++) {
			int nokori = n-i;
			if(nokori%500==0) {
				hantei = true;
				break;
			}else {
				continue;
			}
		}
		if(hantei==true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
