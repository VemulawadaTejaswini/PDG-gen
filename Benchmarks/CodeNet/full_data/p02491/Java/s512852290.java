import java.util.*;

public class Main {
	public static void main(String[] args) {

		int[] ar = new int[2]; 
		int d,r;
		double f;
		
		Scanner sc = new Scanner(System.in);

		for(int i = 0;i < 2;i++){
			ar[i] = sc.nextInt();
		}

		d = ar[0] / ar[1];
		r = ar[0] % ar[1];
		f = (double)ar[0] / ar[1];
		
		System.out.println(d + " " + r + " " + f);
	}
}