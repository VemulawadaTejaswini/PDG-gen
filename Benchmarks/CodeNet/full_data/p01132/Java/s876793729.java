import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] coin = {10, 50, 100, 500};

		while(true){
			int bill = sc.nextInt();
			if(bill==0) break;
			int[] num = new int[4];
			int charge = 0;
			int[] back = new int[4];

			for(int i=0; i<4; i++){
				num[i] = sc.nextInt();
				charge += coin[i]*num[i];
			}

			charge -= bill;

			for(int i=3; i>=0; i--){
				back[i] = charge / coin[i];
				charge -= back[i]*coin[i];
			}

			for(int i=0; i<4; i++){
				if(num[i]-back[i]>=0){
					System.out.println(coin[i]+" "+(num[i]-back[i]));
				}
			}
			System.out.println();
		}
	}

}