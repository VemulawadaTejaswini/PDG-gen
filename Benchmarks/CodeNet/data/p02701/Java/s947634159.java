import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int Kuji = sc.nextInt();
				//リスト定義
				List<String> gift = new ArrayList<String>();

				//kujiの個数回繰り返す。
			for(int i = 1; i <= Kuji; i++) {
				String syohin = sc.next();
				//リストの中にデータがなければ追加する
				if(!gift.contains(syohin)) {
					gift.add(syohin);
				}
			}
				//リストの数を出力する。
		System.out.println(gift.size());

			}
		}