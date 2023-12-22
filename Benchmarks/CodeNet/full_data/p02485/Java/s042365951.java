import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc	= new Scanner(System.in);
		String x;
		int sum = 0;

		while(true){
			x = sc.next();
			if(x.equals("0")){ break; }

			//文字列の配列を作成
			String[] s = new String[x.length()];
			for(int i=0; i<x.length(); i++){
				s[i] = x.substring(i, i+1);
			}

			//各要素を数値に変換して和を取る
			for(int i=0; i<s.length; i++){
				int n = Integer.parseInt(s[i]);
				sum += n;
			}
			//出力
			System.out.println(sum);
		}
	}
}