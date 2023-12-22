import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		long b = sc.nextLong();
		// 文字列の入力
		long[] d = new long[a];
		long[] e = new long[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextLong();
			e[i] = sc.nextLong();
		} 
		int f = 0;
		
		for(int i = 0; i < a; i++){
			if(Math.sqrt(d[i] * d[i] + e[i] * e[i]) <= b){
				f++;
			}
		}
		System.out.println(f);
		
		
	}
}