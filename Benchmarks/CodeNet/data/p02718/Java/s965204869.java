import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			//n
			int n = sc.nextInt();

			//m
			int m = sc.nextInt();

			//n子分リスト
			List<Integer> list = new ArrayList<Integer>();

			for(int i = 0; i <n;i++) {
				list.add(sc.nextInt());
			}
			//フラグ
			boolean flg = true;
			//リストの合計算出
			int sum=0;
			for(int i = 0; i <list.size();i++) {
				sum += list.get(i);
			}

			//リストは降順ソート
			Collections.sort(list, Collections.reverseOrder());

			//forでm要素チェック 1/4*m
			int checkNum = sum/(4*m);

			for(int i =0;i<m;i++) {
				if(list.get(i) <= checkNum) {
					flg = false;
					break;
				}
			}

			if(flg = true) {
				System.out.print("Yes");
			}else {
				System.out.print("No");
			}

			//要素の票 > (合計/(4*M)ならflg=true,以下ならfalse
		}
}

