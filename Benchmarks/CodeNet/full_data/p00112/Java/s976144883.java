import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			int pop[] = new int[61];
			for(int i = 0; i < 61; i++){
				pop[i] = 0;
			}
			
			for (int i = 0; i < n; i++) {
				pop[sc.nextInt()]++;
			}

			int pre_num = 0;
			int mati = 0;
			int sum = 0;
			for (int i = 0; i < pop.length; i++) {
				if(pop[i] == 0){continue;}
				for (int j = 0; j < pop[i]; j++) {
					mati += pre_num;
					sum += mati;
					pre_num = i;
				}
			}

			System.out.println(sum);
		}

	}
}