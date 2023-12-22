import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	String formulaStr = ""; //式を保存する文字列
	int index = 0; //式の文字列のインデックス
	
	public static void main(String[] args) {
		Main main = new Main();
		main.smartCalculator();
		return;
	}
	
	//四則演算を計算する
	private void smartCalculator() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			
			String inputNumStr = bufferedReader.readLine();
			int inputNum = Integer.parseInt(inputNumStr); //与えられる式の数
			
			//式の計算
			for (int i = 0; i < inputNum; i++) {
				formulaStr = bufferedReader.readLine();
				index = 0;
				System.out.println(this.calculationFormula());
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
	
	//式の計算を行う
	private Long calculationFormula() {
		
		long answer = 0;
		
		answer = this.calculationAddSub();
		
		return answer;
	}
	
	//足し算、引き算の処理
	private Long calculationAddSub() {
		
		long answer = this.calculationMulDiv();
		
		while (true) {
			
			switch (formulaStr.charAt(index)) {
				case '+':
					index++;
					answer += this.calculationMulDiv();
					break;
				case '-':
					index++;
					answer -= this.calculationMulDiv();
					break;
				default:
					return answer;
			}
			
		}
	}
	
	//掛け算、割り算の処理
	private Long calculationMulDiv() {
		
		long answer = this.calculationTerm();
		
		while (true) {
			
			switch (formulaStr.charAt(index)) {
				case '*':
					index++;
					answer *= this.calculationTerm();
					break;
				case '/':
					index++;
					answer /= this.calculationTerm();
					break;
				default:
					return answer;
			}
			
		}
	}
	
	//括弧と数字の処理
	private Long calculationTerm() {
		
		long answer = 0;
		
		//括弧があった場合、優先して処理する
		if (formulaStr.charAt(index) == '(') {
			index++;
			answer = this.calculationAddSub();
			index++;
			return answer;
		}
		
		//数字の場合の処理
		if (Character.isDigit(formulaStr.charAt(index))) {
			return this.calculationValue();
		}
		
		return (long) 0;
	}
	
	//文字列から非演算子の数字のみを切り出す
	private Long calculationValue() {
		
		String tmpStr = formulaStr.substring(index); //処理が終わる前の式を切り出す
		String[] tmpStrs = tmpStr.split("[+-/\\*=)]");
		
		index += tmpStrs[0].length(); //インデックスの更新
		
		return Long.parseLong(tmpStrs[0]);
		
	}
}