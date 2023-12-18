import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();  //くじ引きを行った回数
		//重複を許さないHashSetを宣言
		//くじの結果を入れる
		HashSet<String> kuji = new HashSet<String>();

		//くじを行う回数分、結果をkujiに入力する
		for(int i=0 ; i<times ; i++) {
			kuji.add(sc.next());
		}
		System.out.print(kuji.size());
		sc.close();
	}
}
