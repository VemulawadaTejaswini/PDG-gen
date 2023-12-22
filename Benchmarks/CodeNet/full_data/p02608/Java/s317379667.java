
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count=0;



		for(int i=1 ; i<=n ; i++) {
			if(i <= 5) {
				System.out.println(0);
			}else {
			for(int x=1; x<=Math.sqrt(i)-1 ; x++) {
				for(int y=1 ; y<=Math.sqrt(i)-1 ; y++) {
					for(int z=1 ; z<=Math.sqrt(i)-1 ; z++) {
						if(x*x + y*y + z*z + x*y + y*z + z*x == i) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
			count = 0;
		}
		}


		scanner.close();

	}

}