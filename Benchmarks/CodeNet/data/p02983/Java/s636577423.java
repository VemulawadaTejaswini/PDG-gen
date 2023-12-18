import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();

		if(R-L >= 2019) {
			System.out.println(0);
		}else {
			int ans = 2019;
			for(int i=L;i<=R;i++) {
				for(int j=i+1;j<=R;j++) {
					if(i*j % 2019 < ans) {
						ans = i*j % 2019;
					}

					if(ans == 0) {
						System.out.println(0);
						return;
					}
				}
			}
			System.out.println(ans);
		}
	}

}
