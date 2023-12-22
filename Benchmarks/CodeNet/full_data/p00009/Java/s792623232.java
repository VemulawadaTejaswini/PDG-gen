import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextInt() ) {
			int num = scan.nextInt();
			num = (num - 3) / 2;
			int[] primeList = new int[num];
			for(int i = 0; i < num; i++) {
				primeList[i] = 1;
			}
			int cnt = 1;
			
			for(int i = 0; i < num; i++) {
				if(primeList[i] == 1) {
					int primeNum = i + i + 3;
					cnt++;
					for(int j = i + primeNum; j < num; j += primeNum) {
						primeList[j] = 0;
					}
				}
			}
			
			
			System.out.println(cnt);
		}
	}
}