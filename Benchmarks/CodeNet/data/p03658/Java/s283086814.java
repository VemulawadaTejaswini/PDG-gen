import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer []a = new Integer [n];
		int sum = 0;
		for(int i = 0 ; i < n; i++) {
			a[i] = sc.nextInt();
			
		}
		Arrays.sort(a,Collections.reverseOrder());
		
		for(int j = 0; j < k; j++) {
			sum += a[j];
		}
		System.out.println(sum);
	}

}
