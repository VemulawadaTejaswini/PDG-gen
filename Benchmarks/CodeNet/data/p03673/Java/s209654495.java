import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String ans = "";
		for (int i = 0; i < n-1; i++) {
			if(i % 2 == 0){
				ans = ans + scan.nextInt();
			}else{
				ans = scan.nextInt() + ans;
			}
		}
		ans = scan.nextInt() + ans;
		System.out.println(ans);
		scan.close();

	}

}
