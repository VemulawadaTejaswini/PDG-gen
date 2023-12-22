import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		// 判定
		int sum = 0;
		for(int i = 0; i < k; i++){
			if(a > 0){
				sum +=1;
				a -= 1;
			}else if(b > 0) {
				b -= 1;
			}else if(c > 0) {
				sum -=1;
				c -= 1;
			}
		}
		System.out.println(sum);
	}
}
