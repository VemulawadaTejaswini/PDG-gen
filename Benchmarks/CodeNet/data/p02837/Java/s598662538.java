import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //人数	
		//証言リスト。n+1番目にはnの証言がTesimonyクラスとして格納されている
		ArrayList<Tesimony>[] tesList = new ArrayList[n + 1];
		for (int i = 0; i < n + 1; i++)
			tesList[i] = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			 for (int j = 0; j < a; j++) {
				 int to = sc.nextInt();
				 int isTrust = sc.nextInt();
				 Tesimony tes = new Tesimony(to, isTrust);
				 tesList[i + 1].add(tes);
			 }
		}
		int ans = 0;

		for (int bit=0; bit< Math.pow(2, n); bit++) {
			boolean flag = true;
			//全員に対して証言チェック。証言者が「不親切」ならスルー
			for(int i = 0; i < n; i++) {
				if ((1&bit>>i) == 0)  continue;
				//証言の矛盾がないかチェック。矛盾があればループを抜ける
				for(int j = 0; j < tesList[i+ 1].size(); j++) {
					Tesimony tes = tesList[i+1].get(j);
					//矛盾があった場合
					if ( (1&bit>>(tes.to - 1) )  != tes.isTrust) {
						flag = false;
						break;
					}			
				}
			}
			if (flag) {
				int cnt = 0;
				for(int k = 0; k < n; k++) {
					if ((1&bit>>k) == 1) cnt++;
				}
				if (ans < cnt) ans = cnt;
			}
		}
		out.println(ans);	
	}
	//証言。証言対象と真偽を持つ
	static class Tesimony {
		int to;
		int isTrust;
		
		Tesimony(int to, int isTrust){
			this.to = to;
			this.isTrust = isTrust;
		}
		
	}
}