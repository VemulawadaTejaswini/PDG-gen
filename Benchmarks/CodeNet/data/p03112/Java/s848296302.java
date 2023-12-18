import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;

		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();

			String[] tmp = line.split(" ");

			long cntA = Long.parseLong(tmp[0]);
			long cntB = Long.parseLong(tmp[1]);
			long cntq = Long.parseLong(tmp[2]);

			long[] pointJ = new long[(int) cntA];
			for (int i = 0; i < cntA; i++) {
				line = sc.nextLine();
				pointJ[i] = Long.parseLong(line);
			}
			long[] pointT = new long[(int) cntB];
			for (int i = 0; i < cntB; i++) {
				line = sc.nextLine();
				pointT[i] = Long.parseLong(line);
			}

			long[] question = new long[(int) cntq];
			for (int i = 0; i < cntq; i++) {
				line = sc.nextLine();
				question[i] = Long.parseLong(line);
			}
			Arrays.sort(pointJ);
			Arrays.sort(pointT);
			for (int j = 0; j < cntq; j++) {

				long jinjaNW = 0;
				long jinjaNE = 0;
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
				
				
				long teraNW = 0;
				long teraNE = 0;
				for (int t = 0; t < pointT.length; t++) {
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


				long tmpVal  = 0;
				
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

	private static long calc(long jinjaNW, long teraNW, long tmpVal, long question) {
		
		long tmpLow = (teraNW >jinjaNW)? jinjaNW:teraNW;		
		long tmpHogh = (teraNW <=jinjaNW)? jinjaNW:teraNW;
		if(tmpLow !=0 && tmpHogh !=0){
			
			long retVal = 0;
			if(tmpLow <= question && question <= tmpHogh){
				long tmp1 = question - tmpLow + tmpHogh - tmpLow;
				long tmp2 = tmpHogh - question   + tmpHogh - tmpLow;
				
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
