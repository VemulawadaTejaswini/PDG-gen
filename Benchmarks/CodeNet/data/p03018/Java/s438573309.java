import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String base = in.next();

		// 「ABC」→ 「BCA」 BCは沈みAは浮上する
		// 「AC」「BB」は不活性である事を利用して計算量を削減したい
		base = base.replace("AC", "##");
		base = base.replace("BB", "##");

		while ( base.contains("A#") || base.contains("B#") || base.contains("#B") || base.contains("#C") ) {
			base = base.replace("A#", "##");
			base = base.replace("B#", "##");
			base = base.replace("#B", "##");
			base = base.replace("#C", "##");
		}

		int cnt = 0;

		// #で区切ってABCを含む断片のみを見ていく
		for ( String frag : base.split("#") ) {

			if ( frag.contains("ABC") ) {														// 断片がABCを含む時だけ見る				
				char c[] = frag.toCharArray();
				boolean done = false;

				while ( !done ) {
					int i = 0;
					done = true;                                                   // 処理修了と仮定	   				//@fmt:off
					
					while ( i < c.length - 2 ) {
						if ( c[i] == 'A' && c[i + 1] == 'B' && c[i + 2] == 'C' ) {  // ABCを見つけたら						
						     c[i] =  'B';   c[i + 1] =  'C';   c[i + 2] =  'A';		// BCAに置き換えて					//@fmt:on
							done = false;															// 仮定を否定
							cnt++;																	// カウントアップ
							i += 2; 																	// Aが飛んだ先を見に行く

						} else i++;
					}
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
}