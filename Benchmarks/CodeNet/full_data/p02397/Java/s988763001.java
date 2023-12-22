import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		int y=0;
		int swap=0;
		while(true) {
			x=sc.nextInt();
			y=sc.nextInt();
			if(x==0 && y==0) {break;};
			if(x>y) {
				swap=x;
				x=y;
				y=swap;
			}
			System.out.printf("%d %d%n", x,y);
		}
	}

}

