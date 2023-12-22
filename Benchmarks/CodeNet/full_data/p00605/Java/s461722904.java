import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()){
			int vampireNum = s.nextInt();
			int bloodType = s.nextInt();
			int[] stock = new int[bloodType];
			
			for(int i = 0; i < stock.length; i++){
				stock[i] = s.nextInt();
			}
			
			for(int i = 0; i < vampireNum; i++){
				for(int j = 0; j < bloodType; j++){
					stock[j] -= s.nextInt();
				}
			}
			
			boolean result = true;
			for(int i = 0; i < bloodType; i++){
				if(stock[i] < 0)result = false;	
			}
			
			System.out.println(result?
								"Yes"
								:"No");
					
		}
	}
}