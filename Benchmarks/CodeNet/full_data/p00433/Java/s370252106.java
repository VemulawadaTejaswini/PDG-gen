import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.testScoreCalculation();
		return;
	}
	
	//テストの点数を比較し、表示する
	private void testScoreCalculation() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			
			LinkedList<Integer> testScoreAList = new LinkedList<Integer>();
			LinkedList<Integer> testScoreBList = new LinkedList<Integer>();
			
			//Aの得点を入力
			String inputStr = bufferedReader.readLine();
			String[] inputStrs = inputStr.split(" ");
			
			for (int i = 0; i < 4; i++) {
				testScoreAList.add(Integer.parseInt(inputStrs[i]));
			}
			
			//Bの得点を入力
			String inputStr2 = bufferedReader.readLine();
			String[] inputStrs2 = inputStr2.split(" ");
			
			for (int i = 0; i < 4; i++) {
				testScoreBList.add(Integer.parseInt(inputStrs2[i]));
			}
			
			int scoreA = 0;
			int scoreB = 0;
			
			for (int i : testScoreAList) {
				scoreA += i; 
			}
			
			for (int i : testScoreBList) {
				scoreB += i; 
			}
			
			if (scoreA == scoreB) {
				System.out.println(scoreA);
			} else if (scoreA > scoreB) {
				System.out.println(scoreA);
			} else if (scoreA < scoreB) {
				System.out.println(scoreB);
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
}