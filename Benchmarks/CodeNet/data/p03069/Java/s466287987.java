import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		long n = sc.nextLong();
		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");
		long i = 0;
		long count = 0;

		for(;i<n;i++){
			if(S[i].equals("#"))break;
		}

		for(;i<n;i++){
			if(S[i].equals("."))count++;
		}

		// 出力
		System.out.println(count);
	}
}