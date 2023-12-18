import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x=new int[n];
		for(int i=0;i<n;i++) x[i]=sc.nextInt();
		int[] y=Arrays.copyOf(x, n);
		Arrays.sort(y);
		for(int i=0;i<n;i++){
			if(x[i]>y[n/2]) System.out.println(y[n/2-1]);
			else System.out.println(y[n/2]);
		}
	}
}
