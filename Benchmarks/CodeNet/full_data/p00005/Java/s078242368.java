import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] x = new int[2];
		int[] y = new int[2];
		int gcd = 1;
		int lcm;
		int temp;
		while (scan.hasNext()) {
			for (int i = 0; i < x.length; i++) {
				x[i] = scan.nextInt();
				y[i]=x[i];
			}
			Arrays.sort(x);
			while(true){
			if(x[0]==0){
				gcd=x[1];
				break;
			}
			else{
				temp=x[0];
				x[0]=x[1]%x[0];
				x[1]=temp;
			}
			}

			y[0] /= gcd;
			y[1] /= gcd;
			lcm = y[0] * y[1] * gcd;
			System.out.println(gcd + " " + lcm);
		}
	}
}