import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] arrayx=new int[n];
		int[] arrayy=new int[m];

		for(int i=0;i<n;i++) {
			arrayx[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			arrayy[i]=sc.nextInt();
		}
		Arrays.sort(arrayx);
		Arrays.sort(arrayy);
		int x1,y1;

		y1=Math.min(y, arrayy[0]);
		x1=Math.max(x, arrayx[n-1]);

		if(y1-x1>0) {
			System.out.println("No War");
		}else {
			System.out.println("War");
		}
	}
}


