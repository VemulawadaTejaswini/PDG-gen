import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int a[] = new int [N];
		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
		}

		List<String> b = new ArrayList<String>();

		for(int j=0;j<N;j++){
			String c = String.valueOf(a[j]);

			if(b.contains(c)){
				b.remove(b.indexOf(c));
			}else{
				b.add(c);
			}
		}
		// 出力
		System.out.println(b.size());
	}
}
