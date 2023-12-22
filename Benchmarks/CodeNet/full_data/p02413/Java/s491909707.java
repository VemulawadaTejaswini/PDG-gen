import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		int A[][] = new int[r][c];
		// ?????????????´?
		for(int i=0; i<r; i++){
			for(int i2=0; i2<c; i2++){
				int x = scan.nextInt();
				A[i][i2] = x;
			}
		}
		// ??????
		int total = 0;
		for(int i=0; i<r; i++){
			int sumr = 0;
			for(int i2=0; i2<c; i2++){
				System.out.print(A[i][i2] + " ");
				sumr = sumr + A[i][i2];
			}
			System.out.println(sumr);
			total = total + sumr;
		}
		for(int i=0; i<c; i++){
			int sumc = 0;
			for(int i2=0; i2<r; i2++){
				sumc = sumc + A[i2][i];
			}
			System.out.print(sumc + " ");
		}
		System.out.println(total);
			
		
	}

}