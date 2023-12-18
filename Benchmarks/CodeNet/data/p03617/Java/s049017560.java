import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
		int q = scn.nextInt();
		int h = scn.nextInt();
		int s = scn.nextInt();
		int d = scn.nextInt();
		int n = scn.nextInt();
		h = Math.min(h,  2*q);
		s = Math.min(s, 2*h); d = Math.min(d, 2*s);
		n*=4;
		int w = ((n/8)*d); n %= 8;
		int x = ((n/4)*s); n %=4;
		int y = ((n/2)*h); n %=4;
		int z = ((n/1)*q); n%=1;
		
		System.out.println(w+x+y+z);
	}

}
