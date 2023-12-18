import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		double me = sc.nextInt();
		int point = sc.nextInt();
		int count = 0;
		double anser = 0;
		//サイコロの目
			for(int i = 1; i <= me ; i++) {
				double sai = 1.0/me;
				int win = i;
				//コインの振った回数
				while(win<point) {
					win = win*2;
					sai = sai/2;
				}
				anser += sai;
			}
			System.out.println(anser);
		}
	}
