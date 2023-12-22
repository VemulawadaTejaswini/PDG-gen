import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader insISR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(insISR);
		int intA = 1;
		System.out.println("????????\????????????????????????");
		try {
			String strLine = reader.readLine();
			int intNum = Integer.parseInt(strLine);
			int intYakusuu = 0;
			int intThreetimes = 3;
			intYakusuu = intNum % intThreetimes;
			while(intA <= intNum) {
				intYakusuu = intA % intThreetimes;
				if(intYakusuu == 0 && intA != 0) {
					System.out.print(" ");
					System.out.print(intA);
					intThreetimes = intThreetimes + 3;
				}
				if(intYakusuu == 3) {
					System.out.print(" ");
					System.out.print(intA);
				}
				intA = intA + 1;
			}
		//	System.out.println("?????????????????????????????????");
		}catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}