import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	int chokorateBlock[] = new int[2];
	int firstBlock[] = new int[2];;
	int secondBlock[] = new int[2];;
	int shirdBlock[] = new int[2];;
	int secondAndShirdBlock[] = new int[2];
	
	
	
	public static void main(String[] args) {
		Main chokorateBlock= new Main();
		
	}
	
	
	public Main() {
		InputStreamReader is = new InputStreamReader(System.in);       //（１）
        BufferedReader br = new BufferedReader(is);                    //（２）

//        System.out.println("何か入力してください.");
        
        String str = null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}                                    //（３）
		String[] divteStr = str.split(" ", 0);
		chokorateBlock[0] = Integer.parseInt(divteStr[0]);
		chokorateBlock[1] = Integer.parseInt(divteStr[1]);
//		System.out.println(chokorateBlock[0]+""+chokorateBlock[1]);
		double difarence[] = new double[4];
		cutHeight(chokorateBlock, firstBlock, secondAndShirdBlock, 3);
		cutHeight(secondAndShirdBlock, secondBlock, shirdBlock, 2);
		difarence[0] = biggerBestDifarence();
		cutWidth(secondAndShirdBlock, secondBlock, shirdBlock, 2);
		difarence[1] = biggerBestDifarence();
		
		cutWidth(chokorateBlock, firstBlock, secondAndShirdBlock, 3);
		cutWidth(secondAndShirdBlock, secondBlock, shirdBlock, 2);
		difarence[2] = biggerBestDifarence();
		cutHeight(secondAndShirdBlock, secondBlock, shirdBlock, 2);
		difarence[3] = biggerBestDifarence();
		System.out.println((int)lessBestNumber(difarence));
	}
	
	
	
	//縦に切る
	private void cutHeight(int[] block, int[] cuttingBlock1, int[] cuttingBlock2, int cuttingNumber) {
		int cuttingHeightNumber = (int)Math.round(block[1]/cuttingNumber-0.1);
		cuttingBlock1[0] = block[0];
		cuttingBlock1[1] = cuttingHeightNumber;
		cuttingBlock2[0] = block[0];
		cuttingBlock2[1] = block[1] - cuttingHeightNumber;

	}
	
	
	
	//横に切る
	private void cutWidth(int[] block, int[] cuttingBlock1, int[] cuttingBlock2, int cuttingNumber) {
		int cuttingWidthNumber = (int)Math.round(block[0]/cuttingNumber-0.1);
//		System.out.println("block[0]/cutNumber:"+block[0]/cuttingNumber);
//		System.out.println("cutWidthNumber:"+cuttingWidthNumber);
		cuttingBlock1[0] = cuttingWidthNumber;
		cuttingBlock1[1] = block[1];
		cuttingBlock2[0] = block[0] - cuttingWidthNumber;
		cuttingBlock2[1] = block[1];
	}
	
	
	
	private double biggerBestDifarence() {
		double firstBlockArea = (double)firstBlock[0] * firstBlock[1];
		double secondBlockArea = (double)secondBlock[0] * secondBlock[1];
		double shirdBlockArea = (double)shirdBlock[0] * shirdBlock[1];
//		System.out.println(firstBlock[0]+", "+firstBlock[1]);
//		System.out.println(secondBlock[0]+", "+secondBlock[1]);
//		System.out.println(shirdBlock[0]+", "+shirdBlock[1]);
//		System.out.println("firstBlockArea:"+firstBlockArea);
//		System.out.println("secondBlockArea:"+secondBlockArea);
//		System.out.println("shirdBlockArea:"+shirdBlockArea);
		double difarenceArray[] = new double[3];
		difarenceArray[0] = (int)Math.abs(firstBlockArea - secondBlockArea) ;  
		difarenceArray[1] = (int)Math.abs(firstBlockArea - shirdBlockArea);
		difarenceArray[2] = (int)Math.abs(secondBlockArea - shirdBlockArea);
		
		return bigerBestNumber(difarenceArray);
		
	}
	
	
	
	private double bigerBestNumber(double[] array) {
		double max = -1000000000;
		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
			boolean flagMax = max < array[i];
			if(flagMax)
				max = array[i];
		}
		return max;

	}
	
	
	
	private double lessBestNumber(double[] array) {
		double min = 100000000;
		for (int i = 0; i < array.length; i++) {
			if(min > array[i])
				min = array[i];
		}
		return min;

	}
}