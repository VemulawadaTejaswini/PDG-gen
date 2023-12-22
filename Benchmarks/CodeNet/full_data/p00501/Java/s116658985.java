import java.util.Scanner;

/* Signboard */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 古い看板の枚数
		String name = sc.next(); // 店名
		int span; // 間隔
		int cnt=0; // 作れる看板の枚数をカウント
		boolean flg=false;
		int status;
		label: for(int i=0; i<n; i++) {
			String src = sc.next();
			int f_pos=0, l_pos=0; // 最初の文字の位置と最後の文字の位置を保持する
			int q=1;
			for(int k=0; k<src.length(); k++) { // 最初の文字の位置決めループ
				f_pos = src.indexOf(name.charAt(0), f_pos+k); // 店名の最初の文字が最初に出現する位置
				// System.out.println("f_pos -> "+f_pos);
				l_pos = src.lastIndexOf(name.charAt(name.length()-1)); // 店名の最後の文字が最後に出現する位置
				// System.out.println("l_pos -> "+l_pos);
				if(l_pos < f_pos) break;
				span = (l_pos-f_pos+1) / name.length(); // 文字間隔の平均を割り出す
				// System.out.println("span -> "+span);
				for(int m=f_pos; m<src.length(); m++) { // 最後の文字の位置決めループ
					l_pos = src.lastIndexOf(name.charAt(name.length()-1), l_pos+m);
					// System.out.println("l_pos -> "+l_pos);
					status = f_pos;
					for(int o=f_pos; o<l_pos; o++) {
						if(src.charAt(status+span+1) == name.charAt(q)) {
							status+=span+1; // 現在地を更新
							// System.out.println("status -> "+status);
							q++;
							flg=true;
						} else {
							flg=false;
							continue;
						}
						if(flg) {
							cnt++;
							continue label;
						}
					}
					if(l_pos < f_pos) break;
				}
			}
		}
		System.out.println(cnt);
	}
}