import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//キーワード入力
		Scanner sc=new Scanner(System.in);
		String W=sc.next();
		W=W.toLowerCase();
		//kwの長さをカウント：n
		int n=W.length();

		int count=0;
		int m=0;
		int o=0;

		while(true) {
			//①テキスト入力
			String T=sc.next();

			if(T.equals("END_OF_TEXT")) {
				break;
			}

			T=T.toLowerCase();

			//②テキストの長さカウント：m
			m=T.length();

			o=m-n;
			//③から④をm-n回繰り返す
			for(int i=0;i<=o;i++) {
				//③テキストの切り出し
				//④切り出したテキストとkwを比較
				//⑤trueならカウント、それ以外ならスルー
				if(W.equals(T.substring(i,n+i))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

