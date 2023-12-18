import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;

		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();

			String[] tmp = line.split(" ");

			int cntA = Integer.parseInt(tmp[0]);
			int cntB = Integer.parseInt(tmp[1]);
			int cntq = Integer.parseInt(tmp[2]);

			int[] pointJ = new int[cntA];
			for (int i = 0; i < cntA; i++) {
				line = sc.nextLine();
				pointJ[i] = Integer.parseInt(line);
			}
			int[] pointT = new int[cntB];
			for (int i = 0; i < cntB; i++) {
				line = sc.nextLine();
				pointT[i] = Integer.parseInt(line);
			}

			int[] question = new int[cntq];
			for (int i = 0; i < cntq; i++) {
				line = sc.nextLine();
				question[i] = Integer.parseInt(line);
			}

			
			Arrays.sort(pointJ);
			Arrays.sort(pointT);
			
			

			
			for (int j = 0; j < cntq; j++) {

				int jinjaNW = 0;
				int jinjaNE = 0;
				for (int t = 0; t < pointJ.length; t++) {
					if(question[j] < pointJ[t]){
						if(t>=1){
						jinjaNW = pointJ[t-1];
						}
						jinjaNE = pointJ[t];
						break;
					}
				}

				if(jinjaNE == 0){
					jinjaNE = pointJ[pointJ.length-1];
				}
				
				
				int teraNW = 0;
				int teraNE = 0;
				for (int t = 0; t < pointJ.length; t++) {
					if(question[j] < pointT[t]){
						if(t>=1){
						teraNW = pointT[t-1];
						}
						teraNE = pointT[t];
						break;
					}
				}

				if(teraNE == 0){
					teraNE = pointT[pointT.length-1];
				}


				int tmpVal  = 0;
				
				tmpVal = calc(jinjaNW, teraNW, tmpVal, question[j]);
				tmpVal = calc(jinjaNW, teraNE, tmpVal, question[j]);
				tmpVal = calc(jinjaNE, teraNW, tmpVal, question[j]);
				tmpVal = calc(jinjaNE, teraNE, tmpVal, question[j]);
				
				System.out.println(tmpVal);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int calc(int jinjaNW, int teraNW, int tmpVal, int question) {
		
		int tmpLow = (teraNW >jinjaNW)? jinjaNW:teraNW;		
		int tmpHogh = (teraNW <=jinjaNW)? jinjaNW:teraNW;
		if(tmpLow !=0 && tmpHogh !=0){
			
			int retVal = 0;
			if(tmpLow <= question && question <= tmpHogh){
				int tmp1 = question - tmpLow + tmpHogh - tmpLow;
				int tmp2 = tmpHogh - question   + tmpHogh - tmpLow;
				
				retVal = Math.min(tmp1, tmp2);
			}else if (question < tmpLow){
				retVal =tmpHogh - question;
			}else{
				retVal =question - tmpLow;
			}
			
			
			if(tmpVal == 0){
				return tmpVal = retVal;
			}else{
				return Math.min(tmpVal,retVal);
			}
		}else{
			return tmpVal;
		}
	}


}