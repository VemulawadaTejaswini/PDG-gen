import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");

		int i = 0;
		int count1 = 0;
		int count2 = 0;

		for(;i<n;i++){
			if(S[i].equals("#"))break;
		}

		for(;i<n;i++){
			if(S[i].equals("."))count1++;
			if(S[i].equals("#"))count2++;
		}

		// 出力
		System.out.println(count1<count2?count1:count2);
	}
}