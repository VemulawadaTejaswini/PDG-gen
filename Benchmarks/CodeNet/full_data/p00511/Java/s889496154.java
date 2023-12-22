import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.simpleCalculator();
		return;
	}
	
	private void simpleCalculator() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		LinkedList<Long> operandList = new LinkedList<Long>(); //被演算子のリスト
		LinkedList<Character> operatorList = new LinkedList<Character>(); //演算子のリスト
		
		try {
			
			//式の入力
			while (true) {
				
				String inputStr = bufferedReader.readLine();
				
				if (this.numberCheck(inputStr)) {
					
					operandList.add(Long.parseLong(inputStr));
					
				} else {
					
					if (inputStr.charAt(0) != '=') {
						operatorList.add(inputStr.charAt(0));
					} else if (inputStr.charAt(0) == '=') {
						break;
					}
					
				}
			}
			
			//式の計算
			long resultNum = 0;
			for (int i = 1; i < operandList.size(); i++) {
				
				long leftNum = operandList.get(i - 1);
				long rightNum = operandList.get(i);
				
				if (operatorList.get(i - 1) == '+') {
					
					if (resultNum == 0) {
						long tmp = leftNum + rightNum;
						resultNum += tmp;
					} else {
						long tmp = resultNum + rightNum;
						resultNum = tmp;
					}
					
				} else if (operatorList.get(i - 1) == '-') {
					
					if (resultNum == 0) {
						long tmp = leftNum - rightNum;
						resultNum += tmp;
					} else {
						long tmp = resultNum - rightNum;
						resultNum = tmp;
					}
					
				} else if (operatorList.get(i - 1) == '*') {
					
					if (resultNum == 0) {
						long tmp = leftNum * rightNum;
						resultNum += tmp;
					} else {
						long tmp = resultNum * rightNum;
						resultNum = tmp;
					}
					
				} else if (operatorList.get(i - 1) == '/') {
					
					if (resultNum == 0) {
						long tmp = leftNum / rightNum;
						resultNum += tmp;
					} else {
						long tmp = resultNum / rightNum;
						resultNum = tmp;
					}
					
				}
				
			}
			
			System.out.println(resultNum);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
	
	//入力された文字列が数字かどうかを判定する
	private boolean numberCheck(String str) {
		
		try {
			Long.parseLong(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
		
	}
}