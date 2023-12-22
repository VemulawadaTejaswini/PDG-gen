import java.util.Scanner;


public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r,c,i=0,j=0,d=0;
		int sum=0;

		r = sc.nextInt();
		c = sc.nextInt();
		int table[][] = new int[r+1][c+1];

		for(i=0;i<r;i++){
			sum = 0;
			for(j=0;j<c;j++){
				table[i][j] = sc.nextInt();
				sum += table[i][j];
			}
			table[i][j] = sum;
			d += sum;
		}
		for(i=0;i<c;i++){
			sum = 0;
			for(j=0;j<r;j++){
				sum += table[j][i];
			}
			table[j][i] = sum;
		}
		table[j][i] = d;
		for(i=0;i<=r;i++){
			for(j=0;j<=c;j++){
				System.out.print(table[i][j]);
				if(c == j){
					break;
				}
				System.out.print(" ");
				
			}
			
			if(i<=r){
				System.out.println();
			}
			
			sc.close();
		}
	}

}
