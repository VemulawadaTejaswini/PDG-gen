import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int y = sc.nextInt();
		int x = y / 1000 - n;
		int coefficient1 = 9;	//10000円の係数
		int coefficient2 = 4; //5000円の係数
		int result[3] = {-1, -1, -1};
		
		for (int i = 0; i <= n; i++) {
			if ((x - (9 * i)) % 4 ==0) {
				result[0] = i;
				result[1] = (x - 9 * i) / 4;
				result[2] = n - result[0] - result[1];
				break;
			}
		}
		
		System.out.println(result[0] + " " + result[1] + " " + result[2]);
	}
}
