import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		double a,b,x;
		int count=0;
		Scanner sc = new Scanner(System.in);

		a = sc.nextDouble();
		b = sc.nextDouble();
		x = sc.nextDouble();

		for(double i=a; i<=b; i++){
			if(i%x == 0) count++;
		}

		System.out.println(count);
	}
}

