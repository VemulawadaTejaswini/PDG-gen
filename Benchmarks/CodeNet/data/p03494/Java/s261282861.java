import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		int cut = 0;
		int min = 1000000000;
		for (int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
			while(a[i]%2 ==0) {
				a[i]/=2;
				++cut;
			}
			min =Math.min(min, cut);
	}
		System.out.println(min-1);
}
}