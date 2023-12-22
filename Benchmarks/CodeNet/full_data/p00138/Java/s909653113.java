import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int j;
		int race = 8;
		double[] a = new double [24];
		double[][] b = new double [3][8];
		double[] c = new double [24];
		for(int i = 0;i < 24;i++){
			j = in.nextInt();
			a[j-1] = in.nextDouble();
			if(j > race*2) b[2][(j-1) % 8] = a[j-1];
			else if(j > race) b[1][(j-1) % 8] = a[j-1];
			else b[0][(j-1) % 8] = a[j-1];
			c[j-1] = a[j-1];
		}
		Arrays.sort(b[0]);
		Arrays.sort(b[1]);
		Arrays.sort(b[2]);
		for(int i = 0;i < 3;i++){
			for(int l = 0;l < 2;l++){
				for(int k = 0;k < race*(i+1);k++){
					if(b[i][l] == a[k]){
						System.out.printf("%d %.2f\n",(k+1),a[k]);
						a[k] = 0;
					}
				}
			}
		}
		Arrays.sort(a);
		for(int l = 6;l < 8;l++){
			for(int k = 0;k < race*3;k++){	
				if(a[l] == c[k]) System.out.printf("%d %.2f\n",(k+1),c[k]);
			}
		}
	}
}