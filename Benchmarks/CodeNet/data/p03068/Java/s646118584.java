import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		String s = sc.next();
		String[] S = s.split("");
		int k = sc.nextInt();

		// 文字列の抽出
		String str = S[k-1];

		for(int num=0;num<n;num++){
			if(!(S[num].equals(str)))S[num]="*";
		}

		// 出力
		for(String sss:S)System.out.print(sss);
	}
}