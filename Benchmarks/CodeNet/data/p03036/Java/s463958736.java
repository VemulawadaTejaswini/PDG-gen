import java.util.Scanner;

public class Main {
	//half and half


	public static void main(String[] args){
		int r,D,x;
		Scanner sc = new Scanner(System.in);
		r=sc.nextInt();
		D=sc.nextInt();
		x=sc.nextInt();
		for(int i=1;i<=10;i++) {
			x=r*x-D;
			System.out.println(x);
		}
	}
}