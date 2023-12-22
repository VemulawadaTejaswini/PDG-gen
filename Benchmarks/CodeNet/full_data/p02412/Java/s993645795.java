import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//データの読み込みの準備
		Scanner sc = new Scanner(System.in);
		
		while(true){
			//結果格納用変数
			int counter = 0;
			
			//データの読み込み
			int n = sc.nextInt();
			int x = sc.nextInt();	
			
			//終了条件の判定
			if(n == 0 && x == 0){
				break;
			}
			
			for(int i = n; i >= 3; i--){
				for(int j = i - 1; j >= 2; j--){
					//iとjを確定とした時に、残りの値を決定する
					int remainder = x - i - j;
					
					//remainderが初期条件を満たしているかで、条件分岐
					if (remainder <= 0){
						continue;
					}else if (remainder >= j){
						break;
					}else{
						counter++;
					}
				}
			}
			
			System.out.println(counter);
		}
	}
}
