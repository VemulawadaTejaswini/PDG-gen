import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = 0;
		// 文字列の入力
		int[] d = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
		} 
		for(int i = 0; i < a; i++){
			for(int j = i + 1; j < a; j++){
				b += d[i] * d[j];
			}
		}
		System.out.println(b);
		
		
	}
}