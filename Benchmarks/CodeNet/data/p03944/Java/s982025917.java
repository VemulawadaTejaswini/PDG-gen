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
				if(fx>x[i])
				sx = x[i];
				else
				sx = fx;
				break;
			case 2://x>x[i]を満たす領域を黒く塗る
				if(sx<x[i])
				fx = x[i];
				else
				fx=sx;
				break;
			case 3://y<y[i]を満たす領域を黒く塗る
				if(fy>y[i])
				sy = y[i];
				else
				sy = fy;
				break;
			case 4://y>y[i]を満たす領域を黒く塗る
				if(sy<y[i])
				fy = y[i];
				else
				fy = sy;
				break;
			}
		}
		
		
		System.out.println((fx-sx)*(fy-sy));
		

	}
}