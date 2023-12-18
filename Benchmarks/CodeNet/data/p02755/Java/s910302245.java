import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int a = sca.nextInt(); // 8％
	int b = sca.nextInt(); // 10％
	int ans = 0;

	for(int i = 1 ; i <= 1251; i++) {
		if((int)(i * 0.08) == a && (int)(i * 0.1) == b) {
			ans = i;
			break;
		}
		if(i == 1251) {
			ans = -1;
		}
	}

	System.out.println(ans);

	// 後始末
	sca.close();
	}
}