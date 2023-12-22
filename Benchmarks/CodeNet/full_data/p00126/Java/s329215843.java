//Volume1-0126
import java.util.Scanner;

class Main {
	public static void main(String[] args){

		final int L = 9;
		int [][] table;
		char[][] check;

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while(n-- > 0){
			table = new int [L][L];
			check = new char[L][L];

			for(int i=0;i<L;i++){
				for(int j=0;j<L;j++){
					table[i][j] = sc.nextInt();
					check[i][j] = ' ';
				}
			}

			for(int i=0;i<L;i++){
				for(int j=0;j<L;j++){
					for(int k=j+1;k<L;k++){
						if(table[i][j]==table[i][k]){
							check[i][j] = '*';
							check[i][k] = '*';
						}
						if(table[j][i]==table[k][i]){
							check[j][i] = '*';
							check[k][i] = '*';
						}
						if(table[i/3*3+j/3][i%3*3+j%3]==table[i/3*3+k/3][i%3*3+k%3]){
							check[i/3*3+j/3][i%3*3+j%3] = '*';
							check[i/3*3+k/3][i%3*3+k%3] = '*';
						}
					}
				}
			}

			for(int i=0;i<L;i++){
				for(int j=0;j<L;j++){
					System.out.print(check[i][j]);
					System.out.print(table[i][j]);
				}
				System.out.println();
			}
			if(n>0){System.out.println();}
		}
	}
}