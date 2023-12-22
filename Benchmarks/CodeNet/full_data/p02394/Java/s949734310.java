import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String strNum = br.readLine();
		String[] strNumList = strNum.split(" ");
		
		int intNumW = Integer.parseInt(strNumList[0]);
		int intNumH = Integer.parseInt(strNumList[1]);
		int intNumX = Integer.parseInt(strNumList[2]);
		int intNumY = Integer.parseInt(strNumList[3]);
		int intNumR = Integer.parseInt(strNumList[4]);
		
		int intDifferenceXR = intNumX - intNumR;
		int intSumXR = intNumX + intNumR;
		
		int intDifferenceYR = intNumY - intNumR;
		int intSumYR = intNumY + intNumR;
		
		String strMessage = "";
		
		if(intDifferenceXR >= 0 && intSumXR <= intNumW) {
			if(intDifferenceYR >= 0 && intSumYR <= intNumH) {
				strMessage = "Yes";
			}else {
				strMessage = "No";
			}
		}else {
			strMessage = "No";
		}
		System.out.println(strMessage);
	}
}
