import java.util.Scanner;

public interface Main {
	static int a = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, x, y, a;
		for(i=0; i<3000; i++) {
		x = sc.nextInt();
		y = sc.nextInt();
		if(x == 0 && y == 0)	break;
		if(x > y) {
			a = x;
			x = y;
			y = a;
		}
		System.out.printf("%d %d\n", x,y);
		}
		
	}
}
