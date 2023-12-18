
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int C = scanner.nextInt();

		int[][] D = new int[C][C];

		ArrayList<Integer> Cmod0 = new ArrayList<>();
		ArrayList<Integer> Cmod1 = new ArrayList<>();
		ArrayList<Integer> Cmod2 = new ArrayList<>();

		for(int i = 0;i < C; i++) {
			for (int j = 0; j < C; j++) {
				D[i][j]=scanner.nextInt();
			}
		}

		for(int i = 1;i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if((i+j)%3 == 0) {
					Cmod0.add(scanner.nextInt());
				}else if((i+j)%3 == 1) {
					Cmod1.add(scanner.nextInt());
				}else if((i+j)%3 == 2) {
					Cmod2.add(scanner.nextInt());
				}
			}
		}

		int min=Integer.MAX_VALUE;
		int min_temp = 0;
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < C ; j++) {
				if(i==j)continue;
				for (int j2 = 0; j2 < C ; j2++) {
					if(j2 == i || j2 == j)continue;
					for (int k = 0; k < Cmod0.size(); k++) {
						min_temp += D[Cmod0.get(k)-1][i];
					}
					for (int k = 0; k < Cmod1.size(); k++) {
						min_temp += D[Cmod1.get(k)-1][j];
					}
					for (int k = 0; k < Cmod2.size(); k++) {
						min_temp += D[Cmod2.get(k)-1][j2];
					}

					min = (min>min_temp)?min_temp:min;
					min_temp = 0;
				}

			}

		}

		System.out.println(min);


	}

}
