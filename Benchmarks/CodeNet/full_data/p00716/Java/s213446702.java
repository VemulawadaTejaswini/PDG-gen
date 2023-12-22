import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int m = stdIn.nextInt();
		for(int k=0;k<m;k++){
			int money = stdIn.nextInt();
			int copy_money = money;
			int year = stdIn.nextInt();
			int n = stdIn.nextInt();
			int[] pattern = new int[n];
			double[] rate = new double[n];
			int[] com = new int[n];
			int[] ans = new int[n];

			for(int i=0;i<n;i++){
				money = copy_money;
				pattern[i] = stdIn.nextInt();
				rate[i] = stdIn.nextDouble();
				com[i] = stdIn.nextInt();

				if(pattern[i] == 0){
					int plus_money = 0;
					for(int j=0;j<year;j++){
						plus_money += money * rate[i];
						money -= com[i];
					}
					money += plus_money;
				}
				else{
					for(int j=0;j<year;j++){
						money += money * rate[i] - com[i];
					}
				}

				ans[i] = money;
			}

			int max = ans[0];
			for(int i=0;i<n;i++){
				max = Math.max(max,ans[i]);
			}
			System.out.println(max);
		}
	}
}