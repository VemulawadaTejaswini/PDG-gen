
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//判定する自然数の個数
		int count = 0;//素数の個数
		for(int i = 0; i < N; i++){
			int num = sc.nextInt();
			boolean judge = false;
			if(num == 2){
				count++;
			}
			for(int j = 2; j < num; j++ ){
				if(num%j == 0){

					break;
				}
				if(j == num-1){
					judge = true;
				}
				}
			if(judge == true){
				count++;
				judge = false;
			}
		}
		System.out.println(count);
	}

}

