import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] x = new int[5];
		for(int i = 0;i<5;i++) {
			x[i]=scn.nextInt();
		}
		int y = scn.nextInt();
		Arrays.sort(x);
		if(x[4]-x[0]>y) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}
		scn.close();
	}
}
