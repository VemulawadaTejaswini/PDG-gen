import java.util.Scanner;
public class Main {
	public static void main(String[] args){

//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int natsuyasumi = sc.nextInt();
		int kazu = sc.nextInt();
		int shukudaiyaruhi = 0;

//	宿題の数分、宿題やる日を宿題番号分だけ増やす
		for(int i=0 ; i<kazu ; i++) {
			int bangou = sc.nextInt();
			shukudaiyaruhi += bangou;
		}

//	遊べる日数が0日以上かどうか判断
		if(natsuyasumi-shukudaiyaruhi>=0) {
			System.out.print(natsuyasumi-shukudaiyaruhi);
		}
		else {
			System.out.print(-1);
		}
	}
}