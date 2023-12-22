import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//ループ回数判定用
		int i = 0;
		
		//データの格納用配列
		short inputData[] = new short[20000];
		
		//データの入力
		Scanner sc = new Scanner(System.in);
		while(true){
			
			inputData[i] = sc.nextShort();
			
			//終了条件の判定
			if(inputData[i] == 0){
				break;
			}
			
			i++;
		}
		
		//データの出力
		for(int j = 0;  j < i; j++){
			System.out.println("case " + (j + 1) + ": " + inputData[j]);
		}
	}
}
