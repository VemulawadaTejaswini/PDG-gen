import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] cards0 = {
				{1,2,3,4,5,6,7,8,9,10,11,12,13},
				{1,2,3,4,5,6,7,8,9,10,11,12,13},
				{1,2,3,4,5,6,7,8,9,10,11,12,13},
				{1,2,3,4,5,6,7,8,9,10,11,12,13}};

		int i = 0;
		int j = 1;
		int[][] cards = new int[4][13];
		for(int a = 1; a <= n; a++) {
			String index = sc.next();
			if (index.equals("S"))
				i = 0;
			else if (index.equals("H"))
				i = 1;
			else if (index.equals("C"))
				i = 2;
			else if (index.equals("D"))
				i = 3;
			j = sc.nextInt();
			cards[i][j-1] = j;
		}

		for(int ii = 0; ii < cards0.length; ii++) {
			for(int jj = 0; jj < cards0[ii].length; jj++) {
				if(cards0[ii][jj] == cards[ii][jj]) {
					cards0[ii][jj] = 0;
				}
			}
		}

		for(int ii = 0; ii < cards0.length; ii++) {
			for(int jj = 0; jj < cards0[ii].length; jj++) {
				if(cards0[ii][jj] != 0) {
					if (ii == 0)
						System.out.print("S");
					else if(ii == 1)
						System.out.print("H");
					else if(ii == 2)
						System.out.print("C");
					else if(ii == 3)
						System.out.print("D");
					System.out.println(" " + cards0[ii][jj]);
				}
			}
		}
		sc.close();
	}
}
