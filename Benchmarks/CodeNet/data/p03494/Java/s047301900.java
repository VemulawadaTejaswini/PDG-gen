import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//nの入力
		int n = sc.nextInt();
		int a[] = new int[n];
		//偶数の要素を数える
		int count = 0;
		//何回試行できるか数える
		int doing = 0;
		
		for(int i=0;i<n;i++) {
			//a[i]の要素入力
			a[i] = sc.nextInt();
		}
		
		while(true) {
			for(int i = 0;i < n;i++) {
				//もし要素が偶数なら
				if(a[i] % 2 == 0) {
					count++;
					//要素を２で割る
					a[i] = a[i]/2;
				}
			}
			if(count == n) {
				//カウント初期化
				count = 0;
				doing++;
			}else {
				break;
			}
		}
		System.out.println(doing);
	}
}