import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.playDaysCalculation();
		return;
	}
	
	//遊べる日数を計算する
	private void playDaysCalculation() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			
			String inputStr = bufferedReader.readLine();
			int winterBreakDays = Integer.parseInt(inputStr);
			
			String inputStr2 = bufferedReader.readLine();
			double languageWorkbookPageNum = Double.parseDouble(inputStr2);
			
			String inputStr3 = bufferedReader.readLine();
			double arithmeticWorkbookPageNum = Double.parseDouble(inputStr3);
			
			String inputStr4 = bufferedReader.readLine();
			double languageProgressNum = Double.parseDouble(inputStr4);
			
			String inputStr5 = bufferedReader.readLine();
			double arithmeticProgressNum = Double.parseDouble(inputStr5);
			
			double languageWorkbookEndDays = languageWorkbookPageNum / languageProgressNum;
			double arithmeticWorkbookEndDays = arithmeticWorkbookPageNum / arithmeticProgressNum;
			
			int workbookEndDays = 0;
			if (languageWorkbookEndDays > arithmeticWorkbookEndDays) {
				workbookEndDays = (int)Math.ceil(languageWorkbookEndDays);
			} else if (languageWorkbookEndDays < arithmeticWorkbookEndDays) {
				workbookEndDays = (int)Math.ceil(arithmeticWorkbookEndDays);
			} else if (languageWorkbookEndDays == arithmeticWorkbookEndDays) {
				workbookEndDays = (int)Math.ceil(languageWorkbookEndDays);
			}
			
			System.out.println(winterBreakDays - workbookEndDays);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}