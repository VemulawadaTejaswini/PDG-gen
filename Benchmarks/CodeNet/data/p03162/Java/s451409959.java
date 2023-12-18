import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] stock = new int[N][3];
		for (int i = 0; i < N; i++) {
			stock[i][0] = scan.nextInt();
			stock[i][1] = scan.nextInt();
			stock[i][2] = scan.nextInt();
			scan.hasNextLine();
		}
		int prev = -1;
		int flag = -1;
		int t = 0;
	
		int[][] aux = new int[N][3];
		aux[0][0] = stock[0][0];
		aux[0][1] = stock[0][1];
		aux[0][2] = stock[0][2];
		for(int k =1;k<N;k++) {
		    aux[k][0]=Math.max(aux[k-1][1],aux[k-1][2]) + stock[k][0] ;
		    aux[k][1]=Math.max(aux[k-1][0],aux[k-1][2]) + stock[k][1] ;
		    aux[k][2]=Math.max(aux[k-1][0],aux[k-1][1]) + stock[k][2] ;
		}
		
		t = Math.max(Math.max(aux[N-1][0], aux[N-1][1]), aux[N-1][2]);
		
		
		System.out.println(t);
		scan.close();
	}

}
