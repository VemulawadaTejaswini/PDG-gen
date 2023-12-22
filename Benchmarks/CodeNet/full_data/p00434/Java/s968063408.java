import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.notSubmitterSearch();
		return;
	}
	
	//課題の未提出者を検索する
	private void notSubmitterSearch() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		int[] submitterArray = new int[30]; //提出者の配列
		
		try {
			
			for (int i = 0; i < 28; i++) {
				String inputStr = bufferedReader.readLine();
				submitterArray[i] = Integer.parseInt(inputStr);
			}
			
			Arrays.sort(submitterArray); //番号順に並べ替える
			
			int notSubmitter1 = 0;
			int notSubmitter2 = 0;
			for (int i = 1; i < 28; i++) {
				
				int tmp = submitterArray[i - 1];
				int tmp2 = submitterArray[i];
				
				int tmp3 = tmp2 - tmp;
				if (tmp3 == 2 && notSubmitter1 == 0) {
					notSubmitter1 = ++tmp;
				} else if (tmp3 == 2 && notSubmitter2 == 0) {
					notSubmitter2 = ++tmp;
				} else if (tmp3 == 3 && notSubmitter1 == 0) {
					notSubmitter1 = tmp + 2;
				} else if (tmp3 == 3 && notSubmitter2 == 0) {
					notSubmitter2 = tmp + 2;
				}
				
			}
			
			if (notSubmitter1 < notSubmitter2) {
				System.out.println(notSubmitter1);
				System.out.println(notSubmitter2);
			} else if (notSubmitter1 > notSubmitter2) {
				System.out.println(notSubmitter2);
				System.out.println(notSubmitter1);
			} else {
				System.out.println(notSubmitter1);
				System.out.println(notSubmitter2);
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
}