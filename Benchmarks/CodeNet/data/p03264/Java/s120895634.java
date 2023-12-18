import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ki = 0,gu = 0;
		for (int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				gu++;
			}else {
				ki++;
			}
		}
		System.out.println(gu*ki);
	}

}
