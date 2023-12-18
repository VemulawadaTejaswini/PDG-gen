
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<String> prizeList = new ArrayList<>();

		for(int i = 1;i < N; i++) {
			String prize = sc.next();
			for(int j = 0;j <= prizeList.size(); j++) {
				if(prize.equals(prizeList.get(j))) {
					//一致したら何もしない
				}else{
					prizeList.add(prize);
				}
			}
		}
		sc.close();
		System.out.println(prizeList.size());
	}

}
