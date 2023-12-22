import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		int ans =0;
		for(int i=0;i<n;i++) {
			if((i+1)%2==0&&array[i]%2==1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}