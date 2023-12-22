import java.util.Scanner;

public class Main{


	public static int gcd(int a, int b){

		if(b==0)return a;
		return gcd(b, a%b);
	}

	public static int gcd_roop(int a, int b){

		while(true){
			if(b==0)return a;
			int t;
			t=a;
			a=b;
			b=t%b;
		}

	}



	public static void main(String[] args){

		int a, b;

		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();

		System.out.println(gcd_roop(a, b));
		scan.close();

	}

}