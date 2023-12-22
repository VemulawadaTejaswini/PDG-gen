import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			int money0 = Integer.parseInt(br.readLine());
			int year = Integer.parseInt(br.readLine());
			int numOfMethod = Integer.parseInt(br.readLine());
			
			int maxResult = -1;
			for(int j = 0; j < numOfMethod; j++){
				String[] tmpStr = br.readLine().split(" ");
				
				int method = Integer.parseInt(tmpStr[0]);
				double ratio = Double.parseDouble(tmpStr[1]);
				int fee = Integer.parseInt(tmpStr[2]);
				int result = 0;
				
				if(method == 0){
					result = calcTanri(money0, year, ratio, fee);
				}
				else if (method == 1){
					result = calcFukuri(money0, year, ratio, fee);
				}
				
				//System.out.println(result);
				if(result > maxResult){
					maxResult = result;
				}
			}
			
			System.out.println(maxResult);
		}
	}

	private static int calcFukuri(int money0, int year, double ratio, int fee) {
		// TODO ?????????????????????????????????????????????
		for(int i = 0; i < year ; i++){
			money0 *= (1 + ratio);
			money0 -= fee;
		}
		return money0;
	}

	private static int calcTanri(int money0, int year, double ratio, int fee) {
		// TODO ?????????????????????????????????????????????
		int rishiSum = 0;
		
		for(int i = 0; i < year ; i++){
			rishiSum += money0*ratio;
			money0 -= fee;
		}
		
		return money0 + rishiSum;
	}
	
	
}