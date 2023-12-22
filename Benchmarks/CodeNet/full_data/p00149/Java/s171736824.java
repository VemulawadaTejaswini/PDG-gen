import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.eyeTest();
		return;
	}
	
	//視力検査
	private void eyeTest() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			
			String inputStr = "";
			LinkedList<Double> leftEyeList = new LinkedList<Double>();
			LinkedList<Double> rightEyeList = new LinkedList<Double>();
			while (true) {
				
				inputStr = bufferedReader.readLine();
				
				if (inputStr == null || inputStr.equals("")) {
					break;
				}
				
				String[] inputEyeStr = inputStr.split(" ");
				double leftEyeNum = Double.parseDouble(inputEyeStr[0]);
				double rightEyeNum = Double.parseDouble(inputEyeStr[1]);
				leftEyeList.add(leftEyeNum);
				rightEyeList.add(rightEyeNum);
				
			}
			
			int leftA = 0;
			int leftB = 0;
			int leftC = 0;
			int leftD = 0;
			int rightA = 0;
			int rightB = 0;
			int rightC = 0;
			int rightD = 0;
			
			for (double leftEyeNum : leftEyeList) {
				
				if (1.1 <= leftEyeNum) {
					leftA++;
				} else if (0.6 <= leftEyeNum && 1.1 > leftEyeNum) {
					leftB++;
				} else if (0.2 <= leftEyeNum && 0.6 > leftEyeNum) {
					leftC++;
				} else if (0.2 > leftEyeNum) {
					leftD++;
				}
				
			}
			
			for (double rightEyeNum : rightEyeList) {
				
				if (1.1 <= rightEyeNum) {
					rightA++;
				} else if (0.6 <= rightEyeNum && 1.1 > rightEyeNum) {
					rightB++;
				} else if (0.2 <= rightEyeNum && 0.6 > rightEyeNum) {
					rightC++;
				} else if (0.2 > rightEyeNum) {
					rightD++;
				}
				
			}
			
			System.out.printf("%d %d\n", leftA, rightA);
			System.out.printf("%d %d\n", leftB, rightB);
			System.out.printf("%d %d\n", leftC, rightC);
			System.out.printf("%d %d\n", leftD, rightD);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
}