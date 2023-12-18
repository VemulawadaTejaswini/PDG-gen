import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		String N = sc.nextLine();
		String[] Narray = N.split("");
		int ns = 0;
		for (String n : Narray) {
			int n_ = Integer.parseInt(n);
			ns += n_;
		}

		int N_ = Integer.parseInt(N);
		
		if(N_ % ns == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
