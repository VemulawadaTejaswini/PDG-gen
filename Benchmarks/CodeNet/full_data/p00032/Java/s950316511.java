import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
	int r = 0;
	int d = 0;
		while(scan.hasNext()){
			r = 0;
			d = 0;
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if(Math.pow(c, 2) == Math.hypot((double) a, (double) b)){
				r++;
			}
			if(a == b && Math.pow(a, 2) == Math.hypot((double) c / 2, (double) c / 2)){
				d++;
			}
		}

		System.out.printf("%d\n", r);
		System.out.printf("%d\n", d);
	}
}