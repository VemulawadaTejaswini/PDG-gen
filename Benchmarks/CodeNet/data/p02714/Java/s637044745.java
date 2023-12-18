import java.util.Scanner;

// https://atcoder.jp/contests/abc162/tasks/abc162_d
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		String[] array = s.split("");

		int ans = 0;

		for(int i =0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				for(int k =j+1;k<n;k++) {
					if((j-i!=k-j)&&(!(array[i].equals(array[j]))&&!(array[j].equals(array[k]))&&!(array[i].equals(array[k])))) {
						ans = ans + 1;
					}
				}
			}
		}
		System.out.println(ans);

	}
}
