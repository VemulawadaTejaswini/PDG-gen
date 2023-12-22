import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(gcd(x,y));

	}

	public static int gcd(int x,int y){
		int r=0;
		if(x<y){
			swap(x,y);
		}
		while(y>0){
			r=x%y;
			x=y;
			y=r;
		}
		return x;
	}
	public static void swap(int x,int y){
		int dummy=y;
		y=x;
		x=dummy;
	}

	}
