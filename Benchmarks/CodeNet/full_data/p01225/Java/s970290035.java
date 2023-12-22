import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//??\????????°?????????
		int intLoop = scan.nextInt();
		//????¨?????´???´????¢????
		ArrayList<int[]> numList = new ArrayList<int[]>();
		ArrayList<String[]> colorList = new ArrayList<String[]>();
		ArrayList<Integer> ansList = new ArrayList<Integer>();
		//??\???
		for(int i = 0; i < intLoop; i++){
			int[] intNum = new int[9];
			String[] strCol = new String[9];
			for(int j = 0; j < 9; j++){
				intNum[j] = scan.nextInt();
			}
			for(int j = 0; j < 9; j++){
				strCol[j] = scan.next();
			}
			numList.add(intNum);
			colorList.add(strCol);
		}
		for(int i = 0; i < intLoop; i++){
			int intCount = 0;
			int[] arrayR = new int[9];
			int[] arrayG = new int[9];
			int[] arrayB = new int[9];
			int[] intNum = numList.get(i);
			String[] strCol = colorList.get(i);
			//RGB???????????\?????????
			for(int j = 0; j < 9; j++){
				String s = strCol[j];
				if("R".equals(s)){
					arrayR[intNum[j] - 1]++;
				}else if("G".equals(s)){
					arrayG[intNum[j] - 1]++;
				}else if("B".equals(s)){
					arrayB[intNum[j] - 1]++;
				}

			}
			for(int j = 0; j < 7; j++){
				if(arrayR[j] != 0 && arrayR[j+1] != 0 && arrayR[j+2] !=0){
					arrayR[j]--;
					arrayR[j+1]--;
					arrayR[j+2]--;
					intCount++;
				}else if(arrayG[j] != 0 && arrayG[j+1] != 0 && arrayG[j+2] !=0){
					arrayG[j]--;
					arrayG[j+1]--;
					arrayG[j+2]--;
					intCount++;
				}else if(arrayB[j] != 0 && arrayB[j+1] != 0 && arrayB[j+2] !=0){
					arrayB[j]--;
					arrayB[j+1]--;
					arrayB[j+2]--;
					intCount++;
				}
			}
			for(int j = 0; j < 9; j++){

				if(arrayR[j] == 3){
					intCount++;
				}
				if(arrayG[j] == 3){
					intCount++;
				}
				if(arrayB[j] == 3){
					intCount++;
				}
			}
			if(intCount == 3){
				ansList.add(1);
			}else{
				ansList.add(0);
			}
			/*for(int j = 0; j < 9; j++){
				System.out.println((j + 1) + " = R : " + arrayR[j] + " G : " + arrayG[j] + " B : " + arrayB[j]);
			}*/
		}

		//??????
		for(int i = 0; i < ansList.size(); i++){
			System.out.println(ansList.get(i));
		}
	}
}