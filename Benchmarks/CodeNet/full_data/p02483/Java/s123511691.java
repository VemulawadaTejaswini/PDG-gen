import java.util.*;
public class Main {

	static void swap(int x, int y) {
		int t = x;
		x = y;
		y = t;
	}
	
	static void sort3(int[] a) {
		int max, min, sum = 0;
		max = min = a[0];
		for(int r = 0; r < a.length; r++) {
			if(a[r] > max) max = a[r];
			if(a[r] < min) min = a[r];
			sum += a[r];
		}
		a[1] = sum - (max + min);
		a[0] = min;
		a[2] = max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		
		for(int r = 0; r < a.length; r++)
			a[r] = stdIn.nextInt();
		sort3(a);
		
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}

}