import java.util.Scanner;
public class Main {
	public static void main(String atgs[]) {
		Scanner n = new Scanner(System.in);

		int A = n.nextInt();	//"1"の枚数
		int B = n.nextInt();	//"0"の枚数
		int C = n.nextInt();	//"-1"の枚数
		int K = n.nextInt();	//選び取る枚数

		int wa = 0;				//カードの数の和

		if(A + B >= K) {
			for(int i=0;i<A;i++) {
				wa += 1;
			}
			System.out.println(wa);

		}else{
			wa = A;
			K -= (A + B);
			for(int i=0;i<K;i++) {
				wa -= 1;
			}
			System.out.println(wa);
		}
	}
}
