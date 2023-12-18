import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String ans = "";
		ans = ans + scan.nextInt();
		for (int i = 0; i < n-2; i++) {
			if(i % 2 == 0){
				ans = scan.nextInt() + " " + ans;
			}else{
				ans = ans + " " + scan.nextInt();
			}
		}
		ans = scan.nextInt() + " " + ans;
		System.out.println(ans);
		scan.close();

	}

}
