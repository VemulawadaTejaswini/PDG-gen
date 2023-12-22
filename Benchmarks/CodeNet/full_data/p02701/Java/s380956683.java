import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C_164 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] s = new String[n];

		int i = 0;
		while(i < n) {
			s[i] = sc.next();

			i++;
		}
		List<String> goodsList = new ArrayList<String>();
		int flag = 0;
		for(i = 0 ; i < n ; i++) {
			flag = 0;
			for(String goods : goodsList) {
				if(s[i].equals(goods)) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				goodsList.add(s[i]);
			}
		}

		System.out.println(goodsList.size());
	}

}