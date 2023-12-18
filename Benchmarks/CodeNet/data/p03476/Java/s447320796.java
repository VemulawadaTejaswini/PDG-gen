import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//ライブラリ張り付け
		int furui[] = new int[100010];//篩を作成

		for(int i = 2; i <= 100005; i++) {
			furui[i]=i;//篩に2~nまでの値を入れる
		}
		for(int i = 2; i <= Math.sqrt(100010); i++) {
			for(int j = i+i; j <= 100000; j+=i) {//iの倍数は篩落とす
				furui[j]=0;
			}
		}
		//
		int st, en;
		int[] ruisekiWA = new int[100000];
		for(int i = 3; i < 100000; i++) {
			ruisekiWA[i] = ruisekiWA[i-1];
			if(i%2==1&&furui[i]!=0&&furui[(i+1)/2]!=0) {
				ruisekiWA[i]++;
			}
		}
		for(int i = 0; i < n; i++) {
			st=sc.nextInt();
			en=sc.nextInt();
			System.out.println(ruisekiWA[en]-ruisekiWA[st-1]);
		}
	}
}