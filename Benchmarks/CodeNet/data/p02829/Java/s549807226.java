import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		for(int i = 1;i < 4;i++){
			if(a != i && b != i){
				System.out.println(i);
			}
		}
		
		
	}
}