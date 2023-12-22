import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int oldRate = Integer.parseInt(tmpArray[0]);
			int newRate = Integer.parseInt(tmpArray[1]);
			int sum = Integer.parseInt(tmpArray[2]);
			
			if(oldRate == 0 && newRate == 0 && sum == 0){
				break;
			}
			
			int newSumMax = 0;
			for(int i = 1; i <= sum - 1 ; i++){
				for(int j = 1; j <= sum - 1; j++){
					if(addTax(i, oldRate) + addTax(j, oldRate) == sum){
						int tmpNewSum = addTax(i, newRate) + addTax(j, newRate);
						if(newSumMax < tmpNewSum){
							newSumMax = tmpNewSum;
						}
					}
				}
			}
			
			System.out.println(newSumMax);
		}
	}
	
	static int addTax(int price, int rate){
		return price * (100 + rate) / 100;
	}

}