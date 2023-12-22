import java.util.Scanner;
public class TestB_168 {
	public static void main(String[] args) {

//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();//
		if(S.length() <= K) {
			System.out.print(S);
		}
		else {
			System.out.print(S.substring(0,K));
		}

//	パターン2
//	Kまで繰り返すのでも
//		for(int i=0 ; i<K ; i++) {
//			System.out.print(S.charAt(i));
//		}
//		System.out.print("...");
	}
}
