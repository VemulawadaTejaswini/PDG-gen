import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

//		入力ｎを読み取る
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		
//		
		int a = n/3;//3の倍数のとき
		int b = n/10;//nを10で割ったとき3あまり
//		aを出力

		System.out.println(a+" "+b);
		int c = 0;
		int d = b + 10;

//	繰り返す
		for(int i=0;i<a+b-1;i++){
			c = c + 3;
			
		if(c < d){
			
			System.out.print(" "+c);
			}
		else {
				
				System.out.print(" "+d);
				d = d + 10;
				c = c - 3;//bの帳尻あわせ
			}

		}

	}


}
