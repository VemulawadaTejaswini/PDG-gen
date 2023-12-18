import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//入力
		int n = sc.nextInt();
		int k = sc.nextInt();

		int sum = 0;
		
		for (int i = k; i <= n + 1; i++){
			int jBegin = 0;
			int jEnd = 0;
			int i2 = i;
			if (k > n / 2 + 1) i2 = n / 2 + 1;
			for (int j = 0; j < i2; j++){
				jBegin = jBegin + j;
				jEnd = jEnd + (n - j);
			}
			sum = sum + jEnd - jBegin + 1;
		}

		System.out.println(sum % (int)(Math.pow(10, 9) + 7));
	}
}