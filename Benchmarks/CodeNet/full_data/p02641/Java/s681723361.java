import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int integerX = sc.nextInt();  //元の整数
		int youso = sc.nextInt();  //整数列の要素数
		HashSet<Integer> list = new HashSet<Integer>();  //整数列を入れるリスト

		//配列を入力
		for(int i=0 ; i<youso ; i++) {
			list.add(sc.nextInt());
		}
        
		//配列の要素数が0なら0と表示して終了
		if(list.isEmpty() == true) {
			System.out.println(0);
			return;
		}
        
        //指定した整数を+1、-1ずつする
		int i = integerX-1;
		int j = integerX+1;

		//iに+1、jに-1をしながら、配列に含まれるのか判断
		for(;;) {
			if(list.contains(i)) {
				i--;
			}
			else{
				System.out.println(i);
				return;
			}

			if(list.contains(j)) {
				j++;
			}
			else {
				System.out.println(j);
				return;
			}
		}
	}
}