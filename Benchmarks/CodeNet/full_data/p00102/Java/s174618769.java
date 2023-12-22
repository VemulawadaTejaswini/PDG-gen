import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int sub;
		int sum;
		int all;
		int sub2 = 0;
		boolean start = true;

		while(s.hasNext()){
			sub = s.nextInt();
			all = 0;
			if(sub == 0)
				break;
			if(start){
				start = false;
			}else{
				System.out.println();
			}
			int[][] table = new int[sub][sub];
			for(int i = 0; i < sub; i++){
				sum = 0;
				for(int j = 0; j < sub; j++){
					table[i][j] = s.nextInt();
					sum += table[i][j];
					sub2 = 10000;
					while(table[i][j] / sub2 == 0 && sub2 != 0){
						sub2 /= 10;
						System.out.print(" ");
					}
					System.out.print(table[i][j]);
					if(j == sub - 1){
						sub2 = 10000;
						while(sum / sub2 == 0 && sub2 != 0){
							sub2 /= 10;
							System.out.print(" ");
						}
						System.out.println(sum);
					}
				}
			}

			for(int j = 0; j < sub; j++){
				sum = 0;
				for(int i = 0; i < sub; i++){
					sum += table[i][j];
				}
				all += sum;
				sub2 = 10000;
				while(sum / sub2 == 0 && sub2 != 0){
					sub2 /= 10;
					System.out.print(" ");
				}
				System.out.print(sum);
			}
			sub2 = 10000;
			while(all / sub2 == 0 && sub2 != 0){
				sub2 /= 10;
				System.out.print(" ");
			}
			System.out.print(all);
		}
		s.close();
	}

}