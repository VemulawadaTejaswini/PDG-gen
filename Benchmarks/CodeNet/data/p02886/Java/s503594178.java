import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int total = 0;
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}

		for(int j = 0;j < n;j++){
			for(int k = j+1;k < n;k++){
				total += a[j] * a[k];
			}
		}

		System.out.println(total);
	}

}
