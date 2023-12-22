import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}

		int max = a[0];
		int total = 0;

		for(int i=1;i<n;i++) {
			if(max>a[i]) {
				int t = max-a[i];
				total += t;
			}else {
				max = a[i];
			}
		}

		System.out.println(total);

	}

}
