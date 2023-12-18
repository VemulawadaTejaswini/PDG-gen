import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n,k;
			int index;
			String s,s1,c,c2,s2,result;
			n = sc.nextInt();
			k = sc.nextInt();
			s = sc.next();
			s1=s.substring(0,k-1);
			c=s.substring(k-1,k).toLowerCase();
			s2=s.substring(k,s.length());
			result=s1.concat(c).concat(s2);
			// 出力

			System.out.println(result);
	}
}