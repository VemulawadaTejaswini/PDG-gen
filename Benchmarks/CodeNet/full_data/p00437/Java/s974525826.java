import java.util.Scanner;

public class Main {
	private int number[] = new int[3];
	private int product[][] = new int[3][100];
	private int test[][];
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run(){
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			number[i] = scan.nextInt();
		}

		while ((number[0]|number[1]|number[2]) != 0) {
			
			/*
			for (int i = 0; i < 3; i++) {
				product[i] = new int[number[i]];
			}
			*/
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < number[i]; j++) {
					product[i][j] = 2;
				}
			}

			int n = scan.nextInt();
			
			test = new int[n][4];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 4; j++) {
					test[i][j] = scan.nextInt();
				}
			}
			
			for (int i = 0; i < n; i++) {
				if (test[i][3] == 1) {
					product[0][test[i][0] - 1] = 1;
					product[1][test[i][1] - number[0] - 1] = 1;
					product[2][test[i][2] - (number[0] + number[1]) - 1] = 1;
				}
			}
			
			//confirm(n);
			boolean flag = false;
			
			while (!flag) {
				flag = true;
				
				for (int i = 0; i < number[0]; i++) {
					if (product[0][i] == 2) {
						for (int p = 0; p < n; p++) {
							if (test[p][0] == i + 1) {
								if (product[1][test[p][1] -number[0] - 1] == 1 && product[2][test[p][2] - (number[0] + number[1]) - 1] == 1) {
									product[0][i] = 0;
									flag = false;
								}
							}
						}
					}
				}
				
				for (int j = 0; j < number[1]; j++) {
					if (product[1][j] == 2) {
						for (int p = 0; p < n; p++) {
							if (test[p][1] == j + number[0] + 1) {
								if (product[0][test[p][0] - 1] == 1 && product[2][test[p][2] - (number[0] + number[1]) - 1] == 1) {
									product[1][j] = 0;
									flag = false;
								}
							}
						}
					}
				}
				
				for (int k = 0; k < number[2]; k++) {
					if (product[2][k] == 2) {
						for (int p = 0; p < n; p++) {
							if (test[p][2] == k + (number[0] + number[1]) + 1) {
								if (product[0][test[p][0] - 1] == 1 && product[1][test[p][1] - number[0] - 1] == 1) {
									product[2][k] = 0;
									flag = false;
								}
							}
						}
					}
				}
			}
			
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < number[i]; j++) {
					System.out.println(product[i][j]);
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			number[i] = scan.nextInt();
		}
	}
	
	private void confirm(int n){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < number[i]; j++) {
				System.out.print(product[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}
	}

}