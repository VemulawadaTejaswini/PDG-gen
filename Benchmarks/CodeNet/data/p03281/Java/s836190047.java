import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = {3, 5, 7, 11, 13};
		int num = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = i + 1; j < 4; j++) {
				for(int k = j + 1; k < 5; k++) {
					if(p[i] * p[j] * p[k] <= n)num++;
				}
				if(Math.pow(p[i], 3) * p[j] <= n)num++;
			}
			if(Math.pow(p[i], 7) <= n)num++;
		}
		System.out.println(num);
	}
}
