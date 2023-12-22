import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y[][][] = new int[5][4][11];
		for(int i=0; i < x; i++){
			int b = stdIn.nextInt();
			int f = stdIn.nextInt();
			int r = stdIn.nextInt();
			int v = stdIn.nextInt();

		    y[b][f][r]+= v;
		}
		stdIn.close();
		for(int a=1; a <= 4; a++){
			for(int c=1; c <= 3; c++){
				for(int d=1; d <= 10; d++){
						System.out.printf(" %d",y[a][c][d]);
				}
				System.out.println();
			}
			if(a != 4){
				System.out.println("####################");
			}
		}
	}
}

