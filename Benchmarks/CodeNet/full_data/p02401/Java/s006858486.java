import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int result = 0;
		
		//データを入力
		Scanner sc = new Scanner(System.in);
		
		//計算のループ
		loop:while(true){
			//データの入力
			int firstNumber = sc.nextInt();
			String operator = sc.next();
			int secondNumber = sc.nextInt();
			
			//演算子の判定と計算
			switch (operator){
				case "+":
					result = firstNumber + secondNumber;
					break;
				
				case "-":
					result = firstNumber - secondNumber;
					break;
				
				case "*":
					result = firstNumber * secondNumber;
					break;
				
				case "/":
					result = firstNumber / secondNumber;
					break;
					
				case "?":
					//演算子が?の時には、ループから抜ける
					break loop;
			}
			
			//計算結果の出力
			System.out.println(result);
		}
	}
}
