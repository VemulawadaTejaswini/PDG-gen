import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String ans = "";
		while(n != 0) {
			if(n % 2 != 0) {
				n--;
				ans = "1"+ans;
			} else {
				ans = "0"+ans;
			}
			n /= -2;
		}
		if(ans.equals("")) {
			System.out.println("0");
		}else {
			System.out.println(ans);
		}
		sc.close();
	}


}
