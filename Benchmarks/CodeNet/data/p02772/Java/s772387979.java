import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();  //書かれている整数の数
		int shorui[] = new int[sum];  //書類に書かれてる整数が入ってる配列
		
		//配列に1つずつ数字を入力
		for(int i=0 ; i<sum ; i++) {
			shorui[i] = sc.nextInt();
			
			//偶数なら3または5で割り切れるか判断
			if(shorui[i]%2 == 0) {
				if(shorui[i]%3 == 0 || shorui[i]%5 == 0) {
					continue;  //どちらかで割り切れるならfor文に戻る
				}
				else {  //どちらでも割り切れないならその時点で終了
					System.out.print("DENIED");  
					return;
				}
			}
			else {  //奇数ならfor文に戻る
				continue;
			}
		}
		//途中で"DENIED"にならなかったら"APPROVED"
		System.out.print("APPROVED");
	}
}