import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tcase = 0;
		while(true){
			int price = Integer.parseInt(br.readLine());
			if(price == 0){
				break;
			}
			
			if(tcase != 0){
				System.out.println();
			}
			String[] tmpArray = br.readLine().split(" ");

			int c10 = Integer.parseInt(tmpArray[0]);
			int c50 = Integer.parseInt(tmpArray[1]);
			int c100 = Integer.parseInt(tmpArray[2]);
			int c500 = Integer.parseInt(tmpArray[3]);

			//?´???´?????????
			int minimumCoins = Integer.MAX_VALUE;
			int res10 = 0, res50 = 0, res100 = 0, res500 = 0;
			for(int i = 0; i <= c10; i++){
				for(int j = 0; j <= c50; j++){
					for(int k = 0; k <= c100 ; k++ ){
						for(int l = 0; l <= c500; l++){
							if(i*10 + j*50 + k*100 + l*500 >= price){
								int numOfCoins = i + j + k + l;
								Change change = new Change(i*10 + j*50 + k*100 + l*500 - price);
//								System.out.println(i*10 + j*50 + k*100 + l*500 - price);
								if(change.isAvailable(c10, c50, c100, c500)){
//									System.out.println("Available");
									minimumCoins = Math.min(minimumCoins, (c10+c50+c100+c500) - numOfCoins + change.numOfCoins());
//									System.out.println("coins "+ ((c10+c50+c100+c500) - numOfCoins + change.numOfCoins()));
									res10 = i; res50 = j; res100 = k; res500 = l;
								}
 							}
						}
					}
				}
			}

			if(res10 != 0)System.out.println("10 "+res10);
			if(res50 != 0)System.out.println("50 "+res50);
			if(res100 != 0)System.out.println("100 "+res100);
			if(res500 != 0)System.out.println("500 "+res500);
			
			tcase++;
		}
	}

}

class Change {
	int c10, c50, c100, c500;

	public Change(int p){
		c500 = p/500;
		p %= 500;
		c100 = p/100;
		p %= 100;
		c50 = p/50;
		p %= 50;
		c10 = p/10;
	}

	int numOfCoins(){
//		System.out.println("change coins "+ (c10 + c50 + c100 + c500));
		return c10 + c50 + c100 + c500;
	}

	boolean isAvailable(int c10, int c50, int c100, int c500){
//		if((this.c10 == 0 || this.c10 != c10) && (this.c50 == 0 || this.c50 != c50) && 
//				(this.c100 == 0 || this.c100 != c100) && (this.c500 == 0 || this.c500 != c500)){
		if(this.c10*c10 == 0 && this.c50*c50 == 0 && this.c100*c100 == 0 && this.c500*c500 == 0){
			return true;
		}
		else {
			return false;
		}
	}
}