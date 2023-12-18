import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int ad = (int)(a/0.08+1);
			int au = (int)((a+1)/0.08);
			
			int bd = (int)(a/0.1+1);
			int bu = (int)((a+1)/0.1);
			
			for(int i=ad;i<=au;i++) {
				for(int j=bd;j<=bu;b++) {
					if(i==j) {
						System.out.println(i);
						return;
					}
				}
			}
			
			System.out.println(-1);
			
		}

	}