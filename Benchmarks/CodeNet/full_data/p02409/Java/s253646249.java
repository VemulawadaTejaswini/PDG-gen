import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[][] a;
		a = new int[13][11];
		int n = scan.nextInt();
		int i;
		for(i = 1; i <= n; ++i){
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			a[(b - 1) * 3 + f][r] = v;
		}
		int q;
		for(i = 1; i <= 12; ++i){
			for(q = 1; q <= 10; ++q){
				System.out.print(" "+a[i][q]);
				}
			if(i == 12)
				break;
			if(i % 3 == 0){
				System.out.println();
				for(int v = 1;v <= 10; ++v)
				System.out.print("##");
			}
			System.out.println();
		}
	}
}

		