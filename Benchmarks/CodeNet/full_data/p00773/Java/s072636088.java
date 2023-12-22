import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		while(true){
			int x = s.nextInt();
			int y = s.nextInt();
			int sum = s.nextInt();
			double beTax = (double) (x + 100) /100;
			double afTax = (double) (y + 100) / 100;
			int max = 0;
			if(x == 0 && y == 0 && sum == 0)break;
			for(int i = 1;i <= Math.floor(sum/2);i++){
				int taxin = (int) Math.floor(i * beTax);
				int t = sum - taxin;
				int taxin2 = 0;
				int j = 1;
				while(true){
					taxin2 = (int) Math.floor(j * beTax);
					if(taxin2 == t)break;
					if(taxin2 > t){
						taxin2 = -1;
						break;
					}
					j++;
				}
				if(taxin2 < 0)continue;
				int afSum = (int) Math.floor(i * afTax) + (int) Math.floor(j * afTax);
				if(max < afSum)max = afSum;
			}
			System.out.println(max);
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}