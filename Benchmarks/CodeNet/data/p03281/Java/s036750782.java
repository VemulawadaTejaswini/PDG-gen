import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		int count = 0;
		for(int i=1; i<=N; i++) {
			if(i%2==0)continue; //continueで偶数の場合は下の処理を行わない(奇数の場合は行う)
			int Yakusu=0; //ここに約数の個数を入れる
			
			for(int j=1; j<=i; j++) {
				if(i%j==0) Yakusu++; //1%1からN%Nを繰り返し、割り切れる場合Yakusuに＋1する
			}
			
			if(Yakusu==8)count++; //Yakusuの個数がちょうど８のとき
		}							//countに＋1する
		
		System.out.println(count); //N以下で「奇数かつ約数が８個」を満たす数の個数を表示
	}
}