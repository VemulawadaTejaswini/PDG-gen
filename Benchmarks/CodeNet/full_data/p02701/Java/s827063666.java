
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		ArrayList<String> prizeList = new ArrayList<>();
		prizeList.add(sc.next());

		for(int i = 1;i < N; i++) {
			String prize = sc.next();
			boolean judge = true;
			for(int j = 0 ; j < prizeList.size() && judge; j++) {
				if(prizeList.get(j).equals(prize)){
					//もし一回でもかぶったらfalse
					judge = false;
				}
			}
			if(judge) {
				prizeList.add(prize);
			}

		}
		sc.close();
		System.out.println(prizeList.size());
	}
}
