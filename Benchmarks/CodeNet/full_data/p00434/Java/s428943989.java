import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.notSubmitterSearch();
		return;
	}
	
	//課題の未提出者を検索する
	private void notSubmitterSearch() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			
			boolean[] submitterArray = new boolean[30]; //添字が0になっている箇所が未提出者
			
			for (int i = 0; i < 28; i++) {
				String inputStr = bufferedReader.readLine();
				int index = Integer.parseInt(inputStr) - 1;
				submitterArray[index] = true;
			}
			
			for (int i = 0; i < 30; i++) {
				if (!submitterArray[i]) {
					System.out.println(i + 1);
				}
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
}