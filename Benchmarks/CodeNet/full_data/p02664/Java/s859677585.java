import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		//文字取得
		String T = sc.next();
		sc.close();

		String answer = "";
		Character Tbannme ;
		Character Tnohitotsumae ;
		Character Tnoushiro = 'a';

		for(int i = 0; i < T.length(); i++) {
			Tbannme = T.charAt(T.length()-1-i);
			System.out.println(Tbannme);
			if(Tbannme.equals('?')) {
				//ひとつ前を見よう
				if(Tnoushiro.equals('P')) {
					//後ろがPならDが前に
					Tbannme = 'D';
				}else if(Tnoushiro.equals('D')) {
					Tbannme = 'P';
				}else if(Tnoushiro.equals('a')) {
					Tbannme = 'D';
				}
			}
			Tnoushiro = Tbannme;
			answer += Tbannme;

		}

		StringBuffer sb = new StringBuffer(answer);
		System.out.println(sb.reverse());

	}

}
