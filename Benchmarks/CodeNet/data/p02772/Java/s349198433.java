import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();  //書かれている整数の数
		int shorui[] = new int[sum];  //書類に書かれてる整数が入ってる配列

		for(int i=0 ; i<sum ; i++) {
			shorui[i] = sc.nextInt();
            //偶数で、3でも5でも割り切れなければその時点で終了
			if(shorui[i]%2==0 && shorui[i]%3!=0 && shorui[i]%5==0) {
				System.out.println("DENIED");
				return;
			}
		}
		System.out.println("APPROVED");
	}
}