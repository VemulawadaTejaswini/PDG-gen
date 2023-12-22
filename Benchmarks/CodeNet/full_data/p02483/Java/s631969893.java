import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=a,y=b,z=c;
		int work;
		
		if(x>y){
			work=x;
			x=y;
			y=work;
		}
		if(y>z){
			work=y;
			y=z;
			z=work;
		}
		if(x>y){
			work=x;
			x=y;
			y=work;
		}
		
		
		System.out.print(x);
		System.out.print(" ");
		System.out.print(y);
		System.out.print(" ");
		System.out.print(z);
	}

}