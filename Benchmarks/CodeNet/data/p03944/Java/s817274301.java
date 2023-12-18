import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int N = scan.nextInt();
		
		
		int[] x = new int[N];
		int[] y = new int[N];
		int[] a = new int[N];
		
		for(int i =0;i<N;i++){
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			a[i] = scan.nextInt();
		}
		
		int sx=0;
	    int sy=0;
		int fx = W;
		int fy = H;
		
		
		for(int i = 0;i<N;i++){
			switch(a[i]){
			case 1://x<x[i]を満たす領域を黒く塗る
				sx = x[i];
				break;
			case 2://x>x[i]を満たす領域を黒く塗る
				fx = x[i];
				break;
			case 3://y<y[i]を満たす領域を黒く塗る
				sy = y[i];
				break;
			case 4://y>y[i]を満たす領域を黒く塗る
				fy = y[i];
				break;
			}
		}
		
		
		System.out.println((fx-sx)*(fy-sy));
		

	}
}